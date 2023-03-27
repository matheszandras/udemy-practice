package practice.stepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;
import practice.pageobject.BasePageObjects;
import practice.pageobject.NHLObjects;


public class NHLSearchStepDefs extends BasePageObjects {

    public NHLObjects nhlObjects = new NHLObjects();

    @Given("^I open (.*) website$")
    public void open_NHL_Main_page(String nhl) {
        Hooks.getWebDriver().get(nhl);
        new WebDriverWait(Hooks.getWebDriver(), 11).until(ExpectedConditions.invisibilityOf(nhlObjects.mainAd));

    }

}
