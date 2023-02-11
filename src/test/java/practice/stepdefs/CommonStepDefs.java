package practice.stepdefs;

import io.cucumber.java.en.Given;
import practice.hooks.Hooks;

public class CommonStepDefs {

    @Given("I open the main page")
    public void I_open_udemy_main_page() {
        Hooks.getWebDriver().get("https://www.udemy.com/");
    }
}
