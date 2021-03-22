package practice.hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    /**
     * WebDriverManager by bonigarcia: https://github.com/bonigarcia/webdrivermanager#basic-usage
     */
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver chromeDriver;

    @Before
    public void setup() {
        // System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
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