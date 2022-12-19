package practice.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;
import practice.pageobject.SearchObjects;

public class SearchStepDefs {

    public SearchObjects searchValidation = new SearchObjects(Hooks.getWebDriver());

    @When("^I search for (.+) in the main search field$")
    public void search_for_keyword(String keyword) {
       /* WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(searchValidation.mainPageSearchBox));*/
        searchValidation.mainPageSearchBox.sendKeys(keyword);
        searchValidation.searchIcon.click();
    }

    @And("^I select (.+) and (.+) and$")
    public void select_filters(String level, String language) {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(searchValidation.beginnerFilter));
        searchValidation.beginnerFilter.click();
        searchValidation.englishFilter.click();
    }

    @And("^I select the first$")
    public void select_first_result() {
        searchValidation.firstFilteredResult.click();
    }

    @And("^I search for (.+) in the reviews$")
    public void search_text(String text) {
        searchValidation.reviewSearchField.sendKeys(text);
        searchValidation.reviewSearchButton.click();
    }

    @Then("^I check the results$")
    public void check_results() {
        String result = searchValidation.textSearchResult.getText();
        Assert.assertTrue("Search result changed", result.contains("8"));
    }
}
