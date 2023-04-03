package practice.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.hooks.Hooks;


public class CookieSettingsObjects extends BasePageObjects {

    public CookieSettingsObjects() {
        super();
    }

    @FindBy(className = "ot-sdk-container")
    private WebElement cookiePopup;
    @FindBy(className = "cookie-setting-link")
    public WebElement cookiePopupSettings;
    @FindBy(id = "ot-header-id-C0003")
    public WebElement functionalCookieTab;
    @FindBy(css = "label[for*='ot-group-id-C0003']")
    public WebElement functionalCookieSlider;
    @FindBy(css = "button.save-preference-btn-handler")
    public WebElement cookieSettingsConfirmationButton;
    @FindBy(css = "button[data-purpose='footer.links.cookie_preferences']")
    public WebElement cookieSettingsFooter;
    @FindBy(css = "#ot-desc-id-C0003 > div.ot-grp-hdr1 > div.ot-tgl > span")
    public WebElement functionalCookieStatus;
    @FindBy(id = "ot-header-id-C0005")
    public WebElement socialMediaCookieTab;
    @FindBy(css = "#ot-desc-id-C0005 > div.ot-grp-hdr1 > div.ot-tgl > span")
    public WebElement socialMediaCookieStatus;


    public void setCookiePopupSettings() {
        WebDriverWait wait = new WebDriverWait(Hooks.getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(cookiePopup));
        cookiePopupSettings.click();
    }

    public void setFunctionalCookieTab() {
        functionalCookieTab.click();
        functionalCookieSlider.click();
    }

    public void cookieSettingsConfirmation() {
        cookieSettingsConfirmationButton.click();
    }

    public void setCookieSettingsFooter() {
        cookieSettingsFooter.click();
    }

    public void socialMediaCookieStatus() {
        socialMediaCookieTab.click();
    }
}
