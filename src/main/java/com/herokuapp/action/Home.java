package com.herokuapp.action;

import com.herokuapp.page.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

    WebDriver driver;
    HomePage homePage;
    WebDriverWait wait;

    public void clickLnkAddRemoveElement() {

        homePage = new HomePage(driver);
        homePage.menuSelect();

    }

    public void clickLnkABTesting() {

        homePage.clickLnkABTesting(driver);
        homePage.ABTestingPageisDisplayed(driver);

    }

    public void clickLnkBasicAuth() {

        homePage.clickLnkBasicAuth(driver);

    }

}
