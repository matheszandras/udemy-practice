package practice.stepdefs;

import cucumber.api.java.en.Given;
import practice.hooks.Hooks;

public class CommonStepDefs {

    @Given("^I open the (.+) page$")
    public void I_open_udemy_main_page (String url) {
        Hooks.getWebDriver().get(url);
    }
}
