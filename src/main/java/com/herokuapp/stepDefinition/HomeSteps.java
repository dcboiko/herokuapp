package com.herokuapp.stepDefinition;

import com.herokuapp.action.Home;
import com.herokuapp.action.AddRemoveElements;

public class HomeSteps {

    Home home = new Home();
    AddRemoveElements addRemoveElements = new AddRemoveElements();

    public void scenario1() {
        // Feature Add/Remove Elements
        // Scenario 1: Adding a single element to display the delete button
        home.setup();
        home.clickLnkAddRemoveElement();
        home.addSingleElement();
        home.quit();
    }

    public void scenario2() {
        // Scenario 2: Deleting an added element
        home.setup();
        home.clickLnkAddRemoveElement();
        home.addSingleElement();
        home.deleteElement();
        home.quit();
    }
}
