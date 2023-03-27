package practice.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;

public class SearchObjects extends BasePageObjects {

    public SearchObjects() {
        super();
    }

    @FindBy(css = " input[placeholder*='Search for anything']")
    public WebElement mainPageSearchBox;

    @FindBy(css = "#udemy > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-text-sm.header--header--1SLKV.header--flex-middle--2QeVR > div.ud-search-form-autocomplete.header--search-bar--1g81R.ud-form-group > form > button > svg")
    //#udemy > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-text-sm.header--header--1SLKV.header--flex-middle--2QeVR > div.ud-search-form-autocomplete.header--search-bar--1g81R.ud-form-group > form > button > svg
    //button[type='submit']
    //svg[aria-label*='Submit search']
    public WebElement searchIcon;

    @FindBy(css = "input[value*='beginner']")
    public WebElement beginnerFilter;

    @FindBy(css = "div[class^='show-more-module--with-gradient'] > div > div > label:first-child input[name='lang']")
    public WebElement englishFilter;

    @FindBy(css = "div[class^='course-list--container']>div:first-child")
    public WebElement firstFilteredResult;
    @FindBy(css = "button[class*='reviews--trigger-button']")
    public WebElement allReview;

    @FindBy(css = "input[placeholder*='Search reviews']")
    public WebElement reviewSearchField;

    @FindBy(css = "button[class*='reviews-modal--search-submit-button']")
    public WebElement reviewSearchButton;

    @FindBy(css = "form[id=filter-form] > div > div:nth-child(6)")
    public WebElement levelDropdown;

    @FindBy(css = "reviews-modal--reviews-modal-content")
    public WebElement textSearchResult;


    public void searchKeyword (String keyword){
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(mainPageSearchBox));
        mainPageSearchBox.sendKeys(keyword);
        mainPageSearchBox.sendKeys(Keys.ENTER);
        searchIcon.click();
    }

    public void selectFilters (String level, String language){
        levelDropdown.click();
        beginnerFilter.click();
        englishFilter.click();
    }

    public void selectFirst(){
        firstFilteredResult.click();
    }

    public void searchInReviews(String text){
        allReview.click();
        reviewSearchField.sendKeys(text);
        reviewSearchButton.click();
    }
}
