package com.herokuapp.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.herokuapp.action.Home;

public class HomePage {

    Home home = new Home();
    WebDriver driver = home.setup();
    WebElement lnk_addRemoveElement = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));

    public void menuSelect(String menu) {
        if (menu.equals("Add/Remove Elements")) {

            clickLnk_addRemoveElement();

        }
    }

    public void clickLnk_addRemoveElement() {
        lnk_addRemoveElement.click();
    }

}