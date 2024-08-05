package com.herokuapp;

import com.herokuapp.action.AddRemoveElements;
import com.herokuapp.action.Home;

public class Main {

    static AddRemoveElements addRemoveElementsPage;

    public static void main(String[] args) {

        Home home = new Home();

        // Scenario 1: Adding a single element to display the delete button
        home.setup();
        home.clickLnk_addRemoveElement();
        home.addSingleElement();
        home.quit();

        // Scenario 2: Deleting an added element
        home.setup();
        home.clickLnk_addRemoveElement();
        home.addSingleElement();
        home.deleteElement();
        home.quit();
    }

}