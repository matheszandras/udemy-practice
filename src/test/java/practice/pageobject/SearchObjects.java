package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchObjects extends BasePageObjects {

    public SearchObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#u172-search-form-autocomplete--3")
    public WebElement mainPageSearchBox;

    @FindBy(id = "icon-search")
    public WebElement searchIcon;

    @FindBy(css = "#filter-form > div > div:nth-child(2) > div.panel--content-wrapper--1yFBX > div > div > div > div > fieldset > label:nth-child(2) > svg")
    public WebElement beginnerFilter;

    @FindBy(css = "#filter-form > div > div:nth-child(3) > div.panel--content-wrapper--1yFBX > div > div > div > div > fieldset > label:nth-child(2) > svg")
    public WebElement englishFilter;

    @FindBy(css = "#u280-popper-trigger--384 > div > div.course-card--image-wrapper--Sxd90 > img")
    public WebElement firstFilteredResult;

    @FindBy(css = "#u205-form-group--8")
    public WebElement reviewSearchField;

    @FindBy(css = "#udemy > div.main-content-wrapper > div.main-content > div.paid-course-landing-page__container > div.bottom-container > div:nth-child(17) > div > div > div > div > div > div.reviews-section--sub-title--3Lxry > div > div.reviews-section--search-filter--1hXkA > div > form > button")
    public WebElement reviewSearchButton;

    @FindBy(css = "#udemy > div.main-content-wrapper > div.main-content > div.paid-course-landing-page__container > div.bottom-container > div:nth-child(17) > div > div > div > div > div > div.reviews-section--sub-title--3Lxry > div.reviews-section--searched-term--3G2Gx")
    public WebElement textSearchResult;

}
