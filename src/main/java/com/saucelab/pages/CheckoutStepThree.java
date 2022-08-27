package com.saucelab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.saucelab.basePage.BasePage.driver;
public class CheckoutStepThree {

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public static List<WebElement> items;

    public CheckoutStepThree(){
        PageFactory.initElements(driver,this);
    }

    public static Boolean verifyItem(String itemName) {
        for (WebElement item : items) {
            if (item.getText().equals(itemName)) {
                return true;
            }

        }
        return false;
    }
}

