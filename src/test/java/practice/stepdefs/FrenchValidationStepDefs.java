package practice.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;
import practice.pageobject.FrenchValidationObjects;

public class FrenchValidationStepDefs {

    public FrenchValidationObjects frenchValidationObjects = new FrenchValidationObjects(Hooks.getWebDriver());

    @When("^I switch to French language$")
    public void switch_to_french() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(frenchValidationObjects.languageSelector));
        frenchValidationObjects.languageSelector.click();
        frenchValidationObjects.language.click();
        Assert.assertEquals("Selected language isn't French", "Français", frenchValidationObjects.languageSelector.getText());
    }

    @And("^I search for (.+) phrase$")
    public void search_for_android_courses(String phrase) {
        frenchValidationObjects.searchBox.sendKeys(phrase);
        frenchValidationObjects.searchButton.click();
    }

    @Then("^I check the first result$")
    public void check_first_result(){
        frenchValidationObjects.firstAndroidCourse.click();
        Assert.assertEquals("The language of the selected course isn't French", "Français", frenchValidationObjects.courseLanguage.getText());
    }
}
