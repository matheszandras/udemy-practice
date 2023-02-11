package practice.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;
import practice.pageobject.FrenchValidationObjects;

public class FrenchValidationStepDefs {

    public FrenchValidationObjects frenchValidationObjects = new FrenchValidationObjects(Hooks.getWebDriver());

    @When("^I switch to French language$")
    public void switch_to_french() {
        // Click on language selector
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(frenchValidationObjects.languageSelector));
        ((JavascriptExecutor) Hooks.getWebDriver()).executeScript("arguments[0].click();", frenchValidationObjects.languageSelector);
        //frenchValidationObjects.languageSelector.click();
        // Close cookie settings
        WebDriverWait wait1 = new WebDriverWait(Hooks.getWebDriver(), 2);
        wait1.until(ExpectedConditions.visibilityOf(frenchValidationObjects.acceptCookies));
        frenchValidationObjects.acceptCookies.click();
        // No clue, why doesn't find this one:
        WebDriverWait wait2 = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait2.until(ExpectedConditions.visibilityOf(frenchValidationObjects.language));
        ((JavascriptExecutor) Hooks.getWebDriver()).executeScript("arguments[0].click();", frenchValidationObjects.language);
        //frenchValidationObjects.language.click();
        WebDriverWait wait3 = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait3.until(ExpectedConditions.visibilityOf(frenchValidationObjects.languageSelector));
        Assert.assertEquals("Selected language isn't French", "Français", frenchValidationObjects.languageSelector.getText());
    }

    @And("^I search for (.+) phrase$")
    public void search_for_android_courses(String phrase) {
        frenchValidationObjects.searchBox.sendKeys(phrase);
        frenchValidationObjects.searchButton.click();
    }

    @Then("^I check the first result$")
    public void check_first_result() {
        frenchValidationObjects.firstAndroidCourse.click();
        Assert.assertEquals("The language of the selected course isn't French", "Français", frenchValidationObjects.courseLanguage.getText());
    }
}
