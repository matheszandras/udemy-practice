package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrenchValidationObjects extends BasePageObjects {

    public FrenchValidationObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"u349-popper-trigger--5\"]/svg[1]")
    public WebElement languageSelector;

    @FindBy(css = "#u60-popper-content--6 > div > div > div > ul > li:nth-child(4) > a > div")
    public WebElement language;

    @FindBy(css = "#u60-popper-content--6 > div > div > div > ul > li:nth-child(4) > a > div")
    public WebElement selectedLanguage;

    @FindBy(css = "#u79-search-form-autocomplete--1")
    public WebElement searchBox;

    @FindBy(id = "icon-search")
    public WebElement searchButton;

    @FindBy(css = "#u74-popper-trigger--196 > div")
    public WebElement firstAndroidCourse;

    @FindBy(className = "clp-lead__element-item clp-lead__locale")
    public WebElement courseLanguage;
}
