package com.herokuapp.action;

import com.herokuapp.page.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

    WebDriver driver;
    HomePage homePage;
    WebDriverWait wait;

    public void selectMenu(String menu) {

        homePage = new HomePage(driver);
        homePage.clickMenu(menu);

    }
}
