package com.herokuapp.action;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.herokuapp.page.AddRemoveElementsPage;
import com.herokuapp.utils.WebDriverManager;

public class AddRemoveElements {

    WebDriver driver = WebDriverManager.getDriver();
    AddRemoveElementsPage addRemoveElementsPage;

    public void addElements(int elements) {

        for (int i = 0; i < elements; i++) {

            addRemoveElementsPage = new AddRemoveElementsPage(driver);
            addRemoveElementsPage.clickBtnAddElement();

        }

    }

    public void addSingleElement() {

        addRemoveElementsPage.clickBtnAddElement();

    }

    public void deleteElement() {

        addRemoveElementsPage.clickBtnDeleteElement();

    }

    public void checkVisibilityOfDeleteButton(int elements) {

        addRemoveElementsPage.checkVisibilityOfDeleteButton(elements);

    }

    // public void removeElements() {
    // setup();

    // driver.findElement(By.xpath(lnk_addRemoveElement)).click();
    // driver.findElement(By.xpath(btn_addElement)).click();

    // WebElement
    // driver.findElement(By.xpath(btn_removeElement)).click();
    // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(btn_addElement)));

    // Assert.assertFalse("Button should not be displayed",
    // btn_addElement.isDisplayed());

    // driver.quit();

    // }
}