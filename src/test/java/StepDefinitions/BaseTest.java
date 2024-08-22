package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private static WebDriver driver;

    public static void setUpDriver(String browser) throws MalformedURLException {
        String remoteWebDriverUrl = "http://localhost:4444/wd/hub";
        switch (browser.toLowerCase()) {
            case "edge":
                driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), new EdgeOptions());
                break;
            case "firefox":
                driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), new FirefoxOptions());
                break;
            case "chrome":
                driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), new ChromeOptions());
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
