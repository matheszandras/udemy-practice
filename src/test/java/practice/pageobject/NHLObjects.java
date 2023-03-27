package practice.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;

public class NHLObjects extends BasePageObjects {

    public NHLObjects() {
        super();
    }


    @FindBy(css = ".modal-body")
    public WebElement mainAd;
    @FindBy(css = "button[class='close'][aria-label='Close']")
    //span[aria-hidden]
    //button[class='close']
    public WebElement mainAdClose;
    //google_ads_iframe_/21668666170/nhl_web_en/homepage_0

    @FindBy(className = "top-nav__search-container")
    public WebElement searchIcon;

    @FindBy(id = "top-nav__search-autocomplete__input")
    public WebElement searchBar;

    @FindBy(css = "div.ss-options__main.nav-pills.nav-pills--left.nav-pills--no-border > a")
    public WebElement advancedSettings;

    @FindBy(css = "#ss-sort-dropdown")
    public WebElement sortDropdown;

    @FindBy(css = "a[data-value*='new']")
    public WebElement newest;

    @FindBy(css = "section:nth-child(1)  article  span")
    public WebElement retirementDate;


    public void closeAd() {
        mainAdClose.click();
    }

    public void searchForJim(String name) {
        searchIcon.click();
        searchBar.sendKeys(name);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void latestNews() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 3);
        wait.until(ExpectedConditions.elementToBeClickable(advancedSettings));
        advancedSettings.click();
        sortDropdown.click();
        WebDriverWait wait2 = new WebDriverWait(Hooks.getWebDriver(), 3);
        wait2.until(ExpectedConditions.elementToBeClickable(newest));
        newest.click();
    }
}
