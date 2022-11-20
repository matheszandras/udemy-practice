package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CookieSettingsObjects extends BasePageObjects {

    public CookieSettingsObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "onetrust-pc-btn-handler")
    public WebElement cookiePopup;
    @FindBy(id = "ot-header-id-C0003")
    public WebElement functionalCookieTab;
    @FindBy(css = "#ot-desc-id-C0003 > div.ot-grp-hdr1 > div.ot-tgl > label > span.ot-switch-nob")
    public WebElement functionalCookieSlider;
    @FindBy(css = "#onetrust-pc-sdk > div.ot-pc-footer > div.ot-btn-container > button")
    public WebElement cookieSettingsConfirmationButton;
    @FindBy()
            //(css = "#udemy > div.main-content-wrapper > footer > div.footer-section.footer-section-main > div.links-and-locale > ul:nth-child(4) > li:nth-child(3) > a")

    public WebElement cookieSettingsFooter;
    @FindBy(id = "onetrust-pc-btn-handler")
    public WebElement functionalCookieStatus;
    @FindBy (css = "#ot-pc-content > div > div.ot-sdk-four.ot-sdk-columns.ot-tab-list > ul > li:nth-child(3) > div")
    public WebElement socialMediaCookieTab;
    @FindBy(css = "#ot-desc-id-C0005 > div.ot-grp-hdr1 > div.ot-tgl > span")
    public WebElement socialMediaCookieStatus;

}
