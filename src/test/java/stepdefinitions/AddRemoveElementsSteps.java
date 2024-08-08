package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.herokuapp.action.*;

public class AddRemoveElementsSteps {

    AddRemoveElements addRemoveElements = new AddRemoveElements();

    // Feature A/B Test Control
    // Scenario 1: Certifying properties of a split testing page.
    // home.setup();
    // home.clickLnkABTesting();
    // home.quit();

    // // Feature Basic Auth
    // // Scenario 1: Sign in with correct credentials.
    // home.setup();
    // home.clickLnkBasicAuth();
    // home.quit();

    // Scenario 2: Sign in with incorrect credentials.
    // home.setup();
    // home.clickLnk_ABTesting();
    // home.quit();

    @And("add an element")
    public void add_an_element() {

        addRemoveElements.addElements();

    }

    @Then("a delete button must be displayed")
    public void a_delete_button_must_be_displayed() {

        addRemoveElements.deleteElement();

    }
}