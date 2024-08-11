package com.herokuapp.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.utils.WebDriverManager;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Add/Remove Elements')]")
    private WebElement lnkAddRemoveElement;

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private WebElement btnAddElement;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement btnDeletElement;

    @FindBy(xpath = "//a[contains(text(),'A/B Testing')]")
    private WebElement lnkABTesting;

    public HomePage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);

    }

    public void clickMenu(String menu) {

        switch (menu) {
        case "Add/Remove Elements":

            lnkAddRemoveElement.click();
            break;

        case "A/B Testing":

            lnkABTesting.click();
            break;

        }

    }

    public void clickLnkABTesting(WebDriver driver) {

        lnkABTesting.click();

    }
}