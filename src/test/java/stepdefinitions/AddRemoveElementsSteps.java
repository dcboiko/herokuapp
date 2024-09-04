package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.herokuapp.action.*;

public class AddRemoveElementsSteps {

    AddRemoveElements addRemoveElements = new AddRemoveElements();
    

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