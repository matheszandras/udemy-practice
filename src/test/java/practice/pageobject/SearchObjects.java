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
    private WebElement mainPageSearchBox;

    @FindBy(css = "input[value*='beginner']")
    private WebElement beginnerFilter;

    @FindBy(css = "div[class^='show-more-module--with-gradient'] > div > div > label:first-child input[name='lang']")
    private WebElement englishFilter;

    @FindBy(css = "div[class^='course-list--container']>div:first-child")
    private WebElement firstFilteredResult;
    @FindBy(css = "button[class*='reviews--trigger-button']")
    private WebElement allReview;

    @FindBy(css = "input[placeholder*='Search reviews']")
    private WebElement reviewSearchField;

    @FindBy(css = "button[class*='reviews-modal--search-submit-button']")
    private WebElement reviewSearchButton;

    @FindBy(css = "form[id=filter-form] > div > div:nth-child(6)")
    private WebElement levelDropdown;

    @FindBy(css = "reviews-modal--reviews-modal-content")
    public WebElement textSearchResult;


    public void searchKeyword (String keyword){
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(mainPageSearchBox));
        mainPageSearchBox.sendKeys(keyword);
        mainPageSearchBox.sendKeys(Keys.ENTER);
    }

    public void selectFilters (){
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
