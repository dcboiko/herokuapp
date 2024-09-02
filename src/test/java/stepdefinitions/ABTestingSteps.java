package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.herokuapp.action.*;

public class ABTestingSteps {
    Home home;

    ABTesting aBTesting = new ABTesting();

    @Given("I access the herokuapp home")
    public void i_access_the_herokuapp_home() {

        home = new Home();

    }

    @When("I access the menu {string}")
    public void i_access_the_menu_ab_testing(String menu) {

        home.selectMenu(menu);

    }

    @Then("the page {string} is correctly displayed")
    public void the_page_is_correctly_displayed(String page) {

        aBTesting.validateProperties();

    }
}