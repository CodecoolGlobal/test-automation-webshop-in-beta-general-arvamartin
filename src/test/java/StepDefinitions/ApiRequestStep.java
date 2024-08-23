package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class ApiRequestStep {

    private WebDriver driver;

    @Given("user send a GET request to {string}")
    public void userSendGETRequestTo(String url) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(url);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) throws IOException {

        URL url = new URL(driver.getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int actualStatusCode = connection.getResponseCode();
        assertEquals("Unexpected status code: " + actualStatusCode, actualStatusCode, expectedStatusCode);
        connection.disconnect();
        driver.quit();
    }
}
