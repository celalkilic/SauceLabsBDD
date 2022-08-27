package com.saucelab.basePage;

import com.saucelab.pages.*;

public class PageManager {
    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static CheckOutStepOne checkOutStepOne;
    public static CheckOutStepTwo checkOutStepTwo;
    public static CheckoutStepThree checkoutStepThree;
    public static HomePage homePage;

    public static void initialise(){
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        checkOutStepOne = new CheckOutStepOne();
        checkOutStepTwo = new CheckOutStepTwo();
        checkoutStepThree = new CheckoutStepThree();
        homePage = new HomePage();
    }
}
