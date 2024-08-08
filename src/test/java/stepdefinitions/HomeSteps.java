package stepdefinitions;

import com.herokuapp.action.Home;

import io.cucumber.java.en.Given;

public class HomeSteps {

    Home home;

    @Given("I access the menu Add\\/Remove Elements em herokuapp")
    public void i_access_the_menu_add_remove_elements_em_herokuapp() {

        home = new Home();
        home.clickLnkAddRemoveElement();

    }

}
