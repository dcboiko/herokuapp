package com.herokuapp.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.herokuapp.page.HomePage;

public class Home {

    WebDriver driver;
    WebDriverWait wait;
    String url = "https://the-internet.herokuapp.com/";

    HomePage homePage = new HomePage();

    public void setup() {

        this.driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public WebDriver clickLnkAddRemoveElement() {

        homePage.menuSelect(driver);

        return driver;

    }

    public void quit() {

        driver.quit();

    }

    public void addSingleElement() {

        homePage.clickBtnAddElement(driver);

    }

    public void deleteElement() {

        homePage.clickBtnDeleteElement(driver);

    }

    public void clickLnkABTesting() {

        homePage.clickLnkABTesting(driver);
        homePage.ABTestingPageisDisplayed(driver);

    }

    public void clickLnkBasicAuth() {

        homePage.clickLnkBasicAuth(driver);

    }

}
