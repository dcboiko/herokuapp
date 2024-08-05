package com.herokuapp.page;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebElement lnk_addRemoveElement;
    WebElement btn_addElement;
    WebElement btn_DeleteElement;

    public void menuSelect(WebDriver driver) {

        lnk_addRemoveElement = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
        lnk_addRemoveElement.click();

    }

    public void clickBtn_addElement(WebDriver driver) {

        btn_addElement = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        btn_addElement.click();

        btn_DeleteElement = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        assertTrue(btn_DeleteElement.isDisplayed());

    }

    public void clickBtn_DeleteElement(WebDriver driver) {

        btn_DeleteElement = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        btn_DeleteElement.click();

        assertTrue(driver.findElements(By.xpath("//button[contains(text(),'Delete')]")).size() == 0);

    }

}