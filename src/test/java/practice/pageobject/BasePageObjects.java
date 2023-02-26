package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import practice.hooks.Hooks;

public class BasePageObjects {

    private static final String url = "https://www.udemy.com/";
    WebDriver driver;

    public BasePageObjects() {
        this.driver = Hooks.getWebDriver();
        PageFactory.initElements(driver, this);
    }
    public BasePageObjects open () {
        driver.get(url);
        return this;
    }
}
