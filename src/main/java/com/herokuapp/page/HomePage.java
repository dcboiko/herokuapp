package com.herokuapp.page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebElement lnkAddRemoveElement;
    WebElement btnAddElement;
    WebElement btnDeletElement;
    WebElement lnkABTesting;
    WebElement lnkBasicAuth;

    public void menuSelect(WebDriver driver) {

        lnkAddRemoveElement = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
        lnkAddRemoveElement.click();

    }

    public void clickBtnAddElement(WebDriver driver) {

        btnAddElement = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        btnAddElement.click();

        btnDeletElement = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        btnDeletElement.isDisplayed();

    }

    public void clickBtnDeleteElement(WebDriver driver) {

        btnDeletElement = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        btnDeletElement.click();

        assertTrue(driver.findElements(By.xpath("//button[contains(text(),'Delete')]")).size() == 0);

    }

    public void clickLnkABTesting(WebDriver driver) {

        lnkABTesting = driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]"));
        lnkABTesting.click();

    }

    public boolean ABTestingPageisDisplayed(WebDriver driver) {

        if ((driver.getCurrentUrl() != null) || (driver.getClass() != null) || (driver.getTitle() != null)) {

            return true;

        } else {

            return false;
        }
    }

    public void clickLnkBasicAuth(WebDriver driver) {

        // lnkBasicAuth = driver.findElement(By.xpath("//a[contains(text(),'Basic
        // Auth')]"));
        // lnkBasicAuth.click();

        // try {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.alertIsPresent());
        // Alert prompt = driver.switchTo().alert();
        // prompt.dismiss();
        // } catch (Exception e) {
        // e.printStackTrace();
        // // exception handling
        // }

        // // System.out.println("Alert Text: " + alertText);
        // System.out.println();

    }

}