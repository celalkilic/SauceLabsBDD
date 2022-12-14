package com.saucelab.pages;

import com.saucelab.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelab.basePage.BasePage.driver;


public class CheckOutStepTwo {
    @FindBy(id = "first-name")
    private static WebElement firstName;

    @FindBy(id = "last-name")
    private static WebElement lastName;

    @FindBy(id = "postal-code")
    private static WebElement zipCode;

    @FindBy(xpath = "//input[@value='CONTINUE']")
    private static WebElement continueBtn;


    public CheckOutStepTwo() {
        PageFactory.initElements(driver, this);
    }

    public static void sendOrderInformation(String name, String lName, String zip){
        HelperMethods.sendText(firstName, name);
        HelperMethods.sendText(lastName, lName);
        HelperMethods.sendText(zipCode, zip);
    }

    public static void clickContinue(){
        HelperMethods.doClick(continueBtn);
    }

}
