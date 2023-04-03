package practice.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;

public class FrenchValidationObjects extends BasePageObjects {

    public FrenchValidationObjects() {
        super();
    }

    @FindBy(css = "button[class*='language-selector']")
    public WebElement languageSelector;

    @FindBy(css = "span[lang*='fr']")
    public WebElement language;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookies;
    @FindBy(css = "input[placeholder*='Rechercher']")
    public WebElement searchBox;

    @FindBy(css = "div[class^='course-list--container']>div:first-child")
    public WebElement firstAndroidCourse;

    @FindBy(css = "div[class^=language-list--multi-column] a:nth-child(4)")
    public WebElement courseLanguage;

    public void switchLanguage() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(languageSelector));
        languageSelector.click();
        language.click();
    }

    public void searchCourse(String phrase) {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(acceptCookies));
        acceptCookies.click();
        searchBox.sendKeys(phrase);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void checkFirstCourse() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(firstAndroidCourse));
        firstAndroidCourse.click();
    }

}
