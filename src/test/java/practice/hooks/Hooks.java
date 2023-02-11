package practice.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class Hooks {

    public static WebDriver chromeDriver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       /**
        Failed attempts to avoid Cloudflare bot recognition
        ChromeOptions options =  new ChromeOptions();
        options.addArguments("--disable-blink-features");
        options.addArguments("--incognito","--disable-blink-features=AutomationControlled");
        **/
        chromeDriver = new ChromeDriver();
    }

    @After
    public void teardown() {
        chromeDriver.quit();
    }

    public static WebDriver getWebDriver() {
        return chromeDriver;
    }
}
