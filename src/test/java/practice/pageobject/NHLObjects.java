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
    public WebElement mainAdClose; // Note: this selector doesn't work

    @FindBy(className = "top-nav__search-container")
    private WebElement searchIcon;

    @FindBy(id = "top-nav__search-autocomplete__input")
    private WebElement searchBar;

    @FindBy(css = "div.ss-options__main.nav-pills.nav-pills--left.nav-pills--no-border > a")
    private WebElement advancedSettings;

    @FindBy(css = "#ss-sort-dropdown")
    private WebElement sortDropdown;

    @FindBy(css = "a[data-value*='new']")
    private WebElement newest;

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
