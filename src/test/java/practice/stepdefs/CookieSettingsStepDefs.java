package practice.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;
import practice.pageobject.CookieSettingsPage;

public class CookieSettingsStepDefs {

    public CookieSettingsPage cookieSettingsPage = new CookieSettingsPage(Hooks.getWebDriver());

    @When("^I click on the cookie settings$")
    public void click_cookie_settings() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(cookieSettingsPage.cookiePopup));
        cookieSettingsPage.cookiePopup.click();
    }

    @And("^I set the Functional cookies as active$")
    public void set_functional_cookies() {
        cookieSettingsPage.functionalCookieTab.click();
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(cookieSettingsPage.functionalCookieSlider));
        cookieSettingsPage.functionalCookieSlider.click();
        Assert.assertEquals("Functional cookies aren't enabled", "Active", cookieSettingsPage.functionalCookieStatus.getText());
    }

    @And("^I save the settings$")
    public void save_settings() {
        cookieSettingsPage.cookieSettingsConfirmationButton.click();
    }

    @And("^I check the settings$")
    public void check_settings() {
        cookieSettingsPage.cookieSettingsFooter.click();
    }

    @Then("^I see that the Functional cookies and Strictly Necessary Cookies as active$")
    public void check_saved_cookiepolicy() {
        Assert.assertEquals("Functional cookies aren't enabled", "Active", cookieSettingsPage.functionalCookieStatus.getText());
        cookieSettingsPage.socialMediaCookieTab.click();
        Assert.assertEquals("Social Media cookies are enabled", "Inactive", cookieSettingsPage.socialMediaCookieStatus.getText());
        /* The other tabs could be checked as well, for total coverage. */
    }
}
