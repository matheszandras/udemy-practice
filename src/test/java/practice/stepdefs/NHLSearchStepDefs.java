package practice.stepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
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

    @Given("^I open (.*) website and close the ad$")
    public void open_NHL_Main_page_close_ad(String nhl) {
        Hooks.getWebDriver().get(nhl);
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(nhlObjects.mainAdClose));
        JavascriptExecutor jse = (JavascriptExecutor) Hooks.getWebDriver();
        jse.executeScript("arguments[0].click();", nhlObjects.mainAd);
        nhlObjects.closeAd();
    }
}
