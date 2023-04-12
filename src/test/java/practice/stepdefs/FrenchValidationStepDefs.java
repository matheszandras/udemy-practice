package practice.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import practice.pageobject.FrenchValidationObjects;

public class FrenchValidationStepDefs {

    public FrenchValidationObjects frenchValidationObjects = new FrenchValidationObjects();

    @When("^I switch to French language$")
    public void switch_to_french() {
        frenchValidationObjects.switchLanguage();
        Assert.assertEquals("Selected language isn't French", "Français", frenchValidationObjects.languageSelector.getText());
    }

    @And("^I search (.+) phrase$")
    public void search_for_android_courses(String phrase) {
        frenchValidationObjects.searchCourse(phrase);
    }

    @Then("^I check the first result$")
    public void check_first_result() {
        frenchValidationObjects.checkFirstCourse();
        Assert.assertEquals("The language of the selected course isn't French", "Français", frenchValidationObjects.courseLanguage.getText());
    }
}
