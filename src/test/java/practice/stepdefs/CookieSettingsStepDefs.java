package practice.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;
import practice.pageobject.CookieSettingsObjects;

public class CookieSettingsStepDefs {

    public CookieSettingsObjects cookieSettingsObjects = new CookieSettingsObjects(Hooks.getWebDriver());

    @When("^I click on the cookie settings$")
    public void click_cookie_settings() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(cookieSettingsObjects.cookiePopup));
        cookieSettingsObjects.cookiePopupSettings.click();
    }

    @And("^I set the Functional cookies as active$")
    public void set_functional_cookies() {
        cookieSettingsObjects.functionalCookieTab.click();
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(cookieSettingsObjects.functionalCookieSlider));
        cookieSettingsObjects.functionalCookieSlider.click();
        Assert.assertEquals("Functional cookies aren't enabled", "Active", cookieSettingsObjects.functionalCookieStatus.getText());
    }

    @And("^I save the settings$")
    public void save_settings() {
        cookieSettingsObjects.cookieSettingsConfirmationButton.click();
    }

    @And("^I check the settings$")
    public void check_settings() {
        cookieSettingsObjects.cookieSettingsFooter.click();
    }

    @Then("^I see that the Functional cookies and Strictly Necessary Cookies as active$")
    public void check_saved_cookiepolicy() {
        Assert.assertEquals("Functional cookies aren't enabled", "Active", cookieSettingsObjects.functionalCookieStatus.getText());
        cookieSettingsObjects.socialMediaCookieTab.click();
        Assert.assertEquals("Social Media cookies are enabled", "Inactive", cookieSettingsObjects.socialMediaCookieStatus.getText());
        /* The other tabs could be checked as well, for total coverage. */
    }
}
