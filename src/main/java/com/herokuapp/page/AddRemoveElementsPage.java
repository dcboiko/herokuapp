package com.herokuapp.page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.herokuapp.utils.WebDriverManager;

public class AddRemoveElementsPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private WebElement btn_addElement;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement btn_DeleteElement;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/button")
    WebElement listBtn_DeleteElement;

    public AddRemoveElementsPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickBtnAddElement() {

        btn_addElement.click();

    }

    public void clickBtnDeleteElement() {

        btn_DeleteElement.click();

    }

    public void checkVisibilityOfDeleteButton(int elements) throws AssertionError {

        if (elements == 0) {

            System.out.println("Web Element not displayed!!!");

        }
        if (elements == 1) {

            btn_DeleteElement.isDisplayed();

        } else if (elements > 1) {

            assertEquals(elements, driver.findElements(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/button")).size());

        }

        WebDriverManager.closeDriver();
    }

}
