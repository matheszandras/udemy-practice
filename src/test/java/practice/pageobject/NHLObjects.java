package practice.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NHLObjects extends BasePageObjects {

    public NHLObjects() {
        super();
    }

    @FindBy (id = "google_image_div")
    //css = "#google_image_div[class='GoogleActiveViewElement']"
    public WebElement mainAd;

    @FindBy (className = "top-nav__search-container")
    public WebElement searchIcon;

    @FindBy (id = "top-nav__search-autocomplete__input")
    public WebElement searchBar;

    @FindBy (css = "div.ss-options__main.nav-pills.nav-pills--left.nav-pills--no-border > a")
    public WebElement advancedSettings;

    @FindBy (css = "#ss-sort-dropdown")
    public WebElement sortDropdown;

    @FindBy (css = "a[data-value*='new']")
    public WebElement newest;

    @FindBy (css = "section:nth-child(1)  article  span")
    public WebElement retirementDate;

}
