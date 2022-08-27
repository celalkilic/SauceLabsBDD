package com.saucelabs.stepdefinitions;

import com.saucelab.basePage.ConfigReader;
import com.saucelab.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSD {
    @Given("user is actually successfully login")
    public void verifyUserLoggedIn(){
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickLoginBtn();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedUrl, LoginPage.verifyURL());
    }

    @When("I click on item with name {string}")
    public void clickOnItemWithName(String itemName) {
        HomePage.clickItem(itemName);

    }

    @And("I click on the ADD TO CART button")
    public void clickOnTheADDTOCARTButton() {
        ItemPage.clickAddToCart();
    }

    @And("I click on the SHOPPING CART button")
    public void clickOnTheSHOPPINGCARTButton() {
        ItemPage.clickToShoppingCart();
    }

    @And("I click on the CHECKOUT button")
    public void clickOnContinueBtn() {
        CheckOutStepOne.clickOnContinueBtn();
    }

    @And("I enter the information as {string}, {string}, and {string}")
    public void enterInfo(String firstName, String lastName, String zipCode) {
        CheckOutStepTwo.sendOrderInformation(firstName,lastName,zipCode);
    }

    @And("I click on continue button")
    public void clickOnContinueButton() {
        CheckOutStepTwo.clickContinue();
    }

    @Then("Item name matches that of {string}")
    public void verifyItemNameMatches(String item) {
        Assert.assertTrue(CheckoutStepThree.verifyItem(item));
    }
}
