package com.herokuapp.page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.herokuapp.utils.WebDriverManager;

public class AddRemoveElementsPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private WebElement btnAddElement;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement btnDeleteElement;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/button")
    List<WebElement> listBtnDeleteElement;

    public AddRemoveElementsPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickBtnAddElement() {

        btnAddElement.click();

    }

    public void clickBtnDeleteElement() {

        btnDeleteElement.click();

    }

    public void checkVisibilityOfDeleteButton(int elements) throws AssertionError {

        if (elements == 0 || listBtnDeleteElement.isEmpty()) {

            System.out.printf("Element is not present in the DOM.");

        }
        if (elements == 1)

        {

            btnDeleteElement.isDisplayed();

        } else if (elements > 1) {

            assertEquals(elements, driver.findElements(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/button")).size());

        }

        WebDriverManager.closeDriver();
    }

}
