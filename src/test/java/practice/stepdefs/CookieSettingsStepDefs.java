package practice.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import practice.pageobject.CookieSettingsObjects;

public class CookieSettingsStepDefs {

    public CookieSettingsObjects cookieSettingsObjects = new CookieSettingsObjects();

    @When("^I click on the cookie settings$")
    public void click_cookie_settings() {
        cookieSettingsObjects.setCookiePopupSettings();
    }

    @And("^I set the Functional cookies as active$")
    public void set_functional_cookies() {
        cookieSettingsObjects.setFunctionalCookieTab();
        Assert.assertEquals("Functional cookies aren't enabled", "Active", cookieSettingsObjects.functionalCookieStatus.getText());
    }

    @And("^I save the settings$")
    public void save_settings() {
        cookieSettingsObjects.cookieSettingsConfirmation();
    }

    @And("^I check the settings$")
    public void check_settings() {
        cookieSettingsObjects.setCookieSettingsFooter();
    }

    @Then("^I see that the Functional cookies and Strictly Necessary Cookies as active$")
    public void check_saved_cookiepolicy() {
        Assert.assertEquals("Functional cookies aren't enabled", "Active", cookieSettingsObjects.functionalCookieStatus.getText());
        cookieSettingsObjects.socialMediaCookieStatus();
        Assert.assertEquals("Social Media cookies are enabled", "Inactive", cookieSettingsObjects.socialMediaCookieStatus.getText());
    }
}
