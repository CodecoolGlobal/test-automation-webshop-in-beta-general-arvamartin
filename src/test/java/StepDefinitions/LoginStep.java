package StepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LoginStep {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("user is on the {string} page using {string}")
    public void user_is_on_the_page(String basePageUrl,String browser) throws MalformedURLException {
        String remoteWebDriverUrl = "http://localhost:4444/wd/hub";

        switch (browser.toLowerCase()) {
            case "edge":
                driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), new EdgeOptions());
                break;
            case "chrome":
                driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), new ChromeOptions());
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(basePageUrl);
    }
}
