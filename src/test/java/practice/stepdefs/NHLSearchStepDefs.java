package practice.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import practice.hooks.Hooks;
import practice.pageobject.BasePageObjects;
import practice.pageobject.NHLObjects;

import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;


public class NHLSearchStepDefs extends BasePageObjects {

    public NHLObjects nhlObjects = new NHLObjects();

    @Given("^I open (.*) website")
    public void open_NHL_Main_page(String nhl) {
        Hooks.getWebDriver().get(nhl);
        new WebDriverWait(Hooks.getWebDriver(), 11).until(ExpectedConditions.invisibilityOf(nhlObjects.mainAd));
    }


    @When("^I search for (.*)")
    public void search_for_Jim(String name) {

        nhlObjects.searchIcon.click();
        nhlObjects.searchBar.sendKeys(name);
        nhlObjects.searchBar.sendKeys(Keys.ENTER);
    }

    @And("^I check the latest result")
    public void find_latest_news() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 3);
        wait.until(ExpectedConditions.elementToBeClickable(nhlObjects.advancedSettings));
        nhlObjects.advancedSettings.click();
        nhlObjects.sortDropdown.click();
        WebDriverWait wait2 = new WebDriverWait(Hooks.getWebDriver(), 3);
        wait2.until(ExpectedConditions.elementToBeClickable(nhlObjects.newest));
        nhlObjects.newest.click();
    }

    @Then("^I check the retirement date")
    public void check_Jims_retirement() {
        Assert.assertEquals("Retirement date is not matching", nhlObjects.retirementDate.getText(), "Tue, Sep 21, 2021");
    }
}
