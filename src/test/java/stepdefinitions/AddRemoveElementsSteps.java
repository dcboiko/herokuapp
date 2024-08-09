package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.herokuapp.action.*;
import com.herokuapp.utils.WebDriverManager;

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

    @When("add {int} elements")
    public void add_an_element(int elements) {

        addRemoveElements.addElements(elements);

    }

    @Then("{int} elements are visible")
    public void elements_are_visible(int elements) {

        addRemoveElements.checkVisibilityOfDeleteButton(elements);

    }

    @When("I delete the element")
    public void I_delete_the_element() {

        addRemoveElements.deleteElement();

    }

}