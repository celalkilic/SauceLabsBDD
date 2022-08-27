package com.saucelab.pages;

import com.saucelab.utils.HelperMethods;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.saucelab.basePage.BasePage.driver;

public class ItemPage {

    @FindBy(xpath = "//button[text()= 'Add to cart']")
    public static WebElement addBtn;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    public static WebElement shoppingCart;

    public ItemPage(){
        PageFactory.initElements(driver, this);
    }
    public static void clickAddToCart(){
        HelperMethods.doClick(addBtn);
    }
    public static  void clickToShoppingCart(){
        HelperMethods.waitForClickability(shoppingCart);
        HelperMethods.doClick(shoppingCart);
    }

}
