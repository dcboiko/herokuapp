package com.herokuapp.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.herokuapp.page.AddRemoveElementsPage;

public class AddRemoveElements {

    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();


    public void addElements(WebDriver driver) {
        driver.findElement(By.xpath(addRemoveElementsPage.clickBtn_addElement())).click();

        driver.quit();
    }

    // public void removeElements() {
    //     setup();

    //     driver.findElement(By.xpath(lnk_addRemoveElement)).click();
    //     driver.findElement(By.xpath(btn_addElement)).click();

    //     WebElement 
    //     driver.findElement(By.xpath(btn_removeElement)).click();
    //     wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(btn_addElement)));

    //     Assert.assertFalse("Button should not be displayed", btn_addElement.isDisplayed());

    //     driver.quit();

    // }
}