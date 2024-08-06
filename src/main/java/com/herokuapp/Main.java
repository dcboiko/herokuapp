package com.herokuapp;

import com.herokuapp.action.AddRemoveElements;
import com.herokuapp.action.Home;

public class Main {

    static AddRemoveElements addRemoveElementsPage;

    public static void main(String[] args) {

        Home home = new Home();

        // Feature A/B Test Control
        // Scenario 1: Certifying properties of a split testing page.
        // home.setup();
        // home.clickLnk_ABTesting();
        // home.quit();

        // Feature Basic Auth
        // Scenario 1: Sign in with correct credentials.
        home.setup();
        home.clickLnk_basicAuth();
        home.quit();

        // Scenario 2: Sign in with incorrect credentials.
        // home.setup();
        // home.clickLnk_ABTesting();
        // home.quit();

        // Scenario 2: Deleting an added element
        // home.setup();
        // home.clickLnk_addRemoveElement();
        // home.addSingleElement();
        // home.deleteElement();
        // home.quit();

        // Feature Add/Remove Elements
        // Scenario 1: Adding a single element to display the delete button
        // home.setup();
        // home.clickLnk_addRemoveElement();
        // home.addSingleElement();
        // home.quit();

        // // Scenario 2: Deleting an added element
        // home.setup();
        // home.clickLnk_addRemoveElement();
        // home.addSingleElement();
        // home.deleteElement();
        // home.quit();
    }

}