package practice.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import practice.pageobject.SearchObjects;

public class SearchStepDefs {

    public SearchObjects searchValidation = new SearchObjects();

    @When("^I search (.+) in the main search field$")
    public void search_for_keyword(String keyword) {
        searchValidation.searchKeyword(keyword);
    }

    @And("^I select (.+) and (.+) and$")
    public void select_filters() {
        searchValidation.selectFilters();
    }

    @And("^I select the first$")
    public void select_first_result() {
        searchValidation.selectFirst();
    }

    @And("^I search for (.+) in the reviews$")
    public void search_text(String text) {
        searchValidation.searchInReviews(text);
    }

    @Then("^I check the results$")
    public void check_results() {
        String result = searchValidation.textSearchResult.getText();
        Assert.assertTrue("Search result changed", result.contains("8"));
    }
}
