package com.herokuapp;

import org.openqa.selenium.WebDriver;

import com.herokuapp.action.AddRemoveElements;
import com.herokuapp.action.Home;
import com.herokuapp.page.HomePage;

public class Main {

    static AddRemoveElements addRemoveElementsPage;

    public static void main(String[] args) {

        HomePage homePage = new HomePage();
        homePage.menuSelect("Add/Remove Elements");

        // addRemoveElementsPage = new AddRemoveElements();
        // addRemoveElementsPage.addElements(driver);
    }

}