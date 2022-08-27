package com.saucelab.pages;

import com.saucelab.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelab.basePage.BasePage.driver;

public class CheckOutStepOne {

    @FindBy(xpath="//div[@class = 'inventory_item_name']")
    private static WebElement itemName;


    @FindBy(id = "continue-shopping")
    public static WebElement continueBtn;

    public CheckOutStepOne()
    {
        PageFactory.initElements(driver, this);
    }

    public static void clickOnContinueBtn(){
        HelperMethods.doClick(continueBtn);
    }

    public static String getItemName(){
        return HelperMethods.doGetText(itemName);
    }

}