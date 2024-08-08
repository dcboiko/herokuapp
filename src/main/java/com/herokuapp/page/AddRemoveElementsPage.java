package com.herokuapp.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private WebElement btn_addElement;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement btn_DeleteElement;

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
}
