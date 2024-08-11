package com.herokuapp.action;

import org.openqa.selenium.WebDriver;

import com.herokuapp.page.ABTestingPage;
import com.herokuapp.utils.WebDriverManager;

public class ABTesting {

    WebDriver driver = WebDriverManager.getDriver();
    ABTestingPage aBTestingPage;

    public void validateProperties(String properties) {

        aBTestingPage = new ABTestingPage(driver);
        aBTestingPage.aBTestingPageisDisplayed();
        
        WebDriverManager.closeDriver();

    }
}