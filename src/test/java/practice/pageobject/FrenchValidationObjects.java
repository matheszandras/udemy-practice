package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrenchValidationObjects extends BasePageObjects {

    public FrenchValidationObjects() {
        super();
    }

    @FindBy(css = "button[class*='language-selector']")
    public WebElement languageSelector;

    @FindBy(css = "span[lang*='fr']")
    public WebElement language;

    @FindBy(css = "#u60-popper-content--6 > div > div > div > ul > li:nth-child(4) > a > div")
    public WebElement selectedLanguage;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookies;
    @FindBy(css = "input[placeholder*='Rechercher']")
    public WebElement searchBox;

    @FindBy(css = "button[type*='submit']")
    public WebElement searchButton;

    @FindBy(css = "div[id*='u37-popper-trigger--141']")
    public WebElement firstAndroidCourse;

    @FindBy(css = "#fr div.ud-main-content-wrapper div.ud-main-content div.paid-course-landing-page__container > div.top-container.dark-background div.clp-lead__element-meta div.clp-lead__element-item.clp-lead__caption span")
    public WebElement courseLanguage;
}
