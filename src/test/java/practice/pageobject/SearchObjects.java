package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchObjects extends BasePageObjects {

    public SearchObjects() {
        super();
    }

    @FindBy(css = " input[placeholder*='Search for anything']")
    public WebElement mainPageSearchBox;

    @FindBy(css = "button[type='submit']")
    public WebElement searchIcon;

    @FindBy(css = "input[value*='beginner']")
    public WebElement beginnerFilter;

    @FindBy(css = "label[for*='u81-checkbox--31']")
    public WebElement englishFilter;

    @FindBy(css = "div[id*='u81-popper-trigger--680']")
    //#u280-popper-trigger--384 > div > div.course-card--image-wrapper--Sxd90 > img
    public WebElement firstFilteredResult;
    @FindBy(css = "button[class*='reviews--trigger-button']")
    public WebElement allReview;

    @FindBy(css = "input[placeholder*='Search reviews']")
    public WebElement reviewSearchField;

    @FindBy(css = "button[class*='reviews-modal--search-submit-button']")
    public WebElement reviewSearchButton;

    @FindBy(css = "#u211-accordion-panel-title--509")
    public WebElement levelDropdown;

    @FindBy(css = "#udemy > div.main-content-wrapper > div.main-content > div.paid-course-landing-page__container > div.bottom-container > div:nth-child(17) > div > div > div > div > div > div.reviews-section--sub-title--3Lxry > div.reviews-section--searched-term--3G2Gx")
    public WebElement textSearchResult;

}
