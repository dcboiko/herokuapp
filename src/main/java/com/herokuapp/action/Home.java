package com.herokuapp.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.herokuapp.page.HomePage;

import dev.failsafe.internal.util.Assert;

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

    public WebDriver clickLnk_addRemoveElement() {

        homePage.menuSelect(driver);

        return driver;

    }

    public void quit() {

        driver.quit();

    }

    public void addSingleElement() {

        homePage.clickBtn_addElement(driver);

    }

    public void deleteElement() {

        homePage.clickBtn_DeleteElement(driver);

    }

}
