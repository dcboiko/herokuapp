package com.herokuapp.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

    WebDriver driver;
    WebDriverWait wait;

    String url = "https://the-internet.herokuapp.com/";

    public WebDriver setup() {

        this.driver = new ChromeDriver();
        driver.get(url);

        return driver;

    }

}
