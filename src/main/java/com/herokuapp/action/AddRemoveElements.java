package com.herokuapp.action;

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
}