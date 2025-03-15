package com.herokuapp.action;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.herokuapp.page.ABTestingPage;
import com.herokuapp.utils.WebDriverManager;

public class ABTesting {

    WebDriver driver = WebDriverManager.getDriver();
    ABTestingPage aBTestingPage;

    public void pageCorrectlyDisplayed(String page) {

        aBTestingPage = new ABTestingPage(driver);
        System.out.println(page);
        assertTrue(aBTestingPage.getClass().getName().contains(page));

    }
}