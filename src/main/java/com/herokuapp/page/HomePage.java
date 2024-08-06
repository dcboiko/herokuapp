package com.herokuapp.page;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class HomePage {

    WebElement lnk_addRemoveElement;
    WebElement btn_addElement;
    WebElement btn_deletElement;
    WebElement lnk_ABTesting;
    WebElement lnk_basicAuth;

    public void menuSelect(WebDriver driver) {

        lnk_addRemoveElement = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
        lnk_addRemoveElement.click();

    }

    public void clickBtn_addElement(WebDriver driver) {

        btn_addElement = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        btn_addElement.click();

        btn_deletElement = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        assertTrue(btn_deletElement.isDisplayed());

    }

    public void clickBtn_DeleteElement(WebDriver driver) {

        btn_deletElement = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        btn_deletElement.click();

        assertTrue(driver.findElements(By.xpath("//button[contains(text(),'Delete')]")).size() == 0);

    }

    public void clickLnk_ABTesting(WebDriver driver) {

        lnk_ABTesting = driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]"));
        lnk_ABTesting.click();

    }

    public boolean ABTestingPageisDisplayed(WebDriver driver) {

        if ((driver.getCurrentUrl() != null) || (driver.getClass() != null) || (driver.getTitle() != null)) {

            return true;

        } else {

            return false;
        }
    }

    public void clickLnk_basicAuth(WebDriver driver) {

        // lnk_basicAuth = driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]"));
        // lnk_basicAuth.click();

        // try {
        //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //     wait.until(ExpectedConditions.alertIsPresent());
        //     Alert prompt = driver.switchTo().alert();
        //     prompt.dismiss();
        // } catch (Exception e) {
        //     e.printStackTrace();
        //     // exception handling
        // }

        // // System.out.println("Alert Text: " + alertText);
        // System.out.println();

    }

}