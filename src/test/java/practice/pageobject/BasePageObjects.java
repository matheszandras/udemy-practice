package practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageObjects {

    public BasePageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
