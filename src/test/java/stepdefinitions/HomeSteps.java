package stepdefinitions;

import com.herokuapp.action.Home;

import io.cucumber.java.en.Given;

public class HomeSteps {

    Home home;

    @Given("I access the menu {string} em herokuapp")
    public void i_access_the_menu_em_herokuapp(String menu) {

        home = new Home();
        home.selectMenu(menu);

    }

}
