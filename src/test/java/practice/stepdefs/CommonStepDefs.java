package practice.stepdefs;

import io.cucumber.java.en.Given;
import practice.pageobject.BasePageObjects;

public class CommonStepDefs extends BasePageObjects{

    @Given("I open the main page")
    public void I_open_udemy_main_page() {
        open();
    }
}
