package practice.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import practice.pageobject.BasePageObjects;
import practice.pageobject.NHLObjects;

public class CommonStepDefs extends BasePageObjects {

    public NHLObjects nhlObjects = new NHLObjects();

    @Given("I open the main page")
    public void I_open_udemy_main_page() {
        open();
    }

    @When("^I search for (.*)")
    public void search_for_Jim(String name) {
        nhlObjects.searchForJim(name);
    }

    @And("^I check the latest result")
    public void find_latest_news() {
        nhlObjects.latestNews();
    }

    @Then("^I check the retirement date")
    public void check_Jims_retirement() {
        Assert.assertEquals("Retirement date is not matching", "Tue, Sep 21, 2021", nhlObjects.retirementDate.getText());
    }

}
