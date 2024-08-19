package com.herokuapp.page;

import org.testng.annotations.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.utils.WebDriverManager;

public class ABTestingPage {

    WebDriver driver;

    @FindBy(xpath = "//h3[contains(text(),'A/B Test Control')]")
    private WebElement aBTestingPageTitle;

    String aBTestingPageTitleName = "h3";
    String aBTestingPageTitleText = "A/B Test Control";

    @FindBy(xpath = "//p[contains(text(),'Also known as split testing. This is a way in whic')]")
    private WebElement aBTestingPageBody;

    String aBTestingPageBodyName = "p";
    String aBTestingPageBodyText = "Also known as split testing. This is a way in whic')]";

    public ABTestingPage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);

    }

    public void aBTestingPageisDisplayed() {

        boolean isDisplayedBody = aBTestingPageBody.isDisplayed();
        assertTrue(isDisplayedBody);

        WebDriverManager.closeDriver();
    }
}