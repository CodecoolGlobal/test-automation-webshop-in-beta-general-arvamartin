package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;


public class LoginStep {

    private WebDriver driver;
    private LoginPage loginPage;


    @Given("user is using {string} browser")
    public void userIsUsing(String browser) throws MalformedURLException {
        BaseTest.setUpDriver(browser);
        driver = BaseTest.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("user is on the {string} page")
    public void userIsOnThePage(String basePageUrl) {
        driver.get(basePageUrl);
        driver.manage().window().maximize();
    }

    @When("user enters {string} username")
    public void userEntersUsername(String username) {
        loginPage.userEntersUsername(username);
    }

    @When("user enters {string} password")
    public void userEntersPassword(String password) {
        loginPage.userEntersPassword(password);
    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        loginPage.userClicksOnLoginBtn();
    }


    @Then("user is on the desired {string} page")
    public void userIsOnTheDesiredPage(String desiredPage) {
        assertEquals(driver.getCurrentUrl(), desiredPage);
    }

    @When("user enters invalid {string} username")
    public void userEntersInvalidUsername(String username) {
        loginPage.userEntersUsername(username);
    }

    @And("user enters invalid {string} password")
    public void userEntersInvalidPassword(String password) {
        loginPage.userEntersPassword(password);
    }

    @Then("user is not on the {string} home page")
    public void userIsNotOnTheHomePage(String homePageUrl) {
        assertNotEquals(homePageUrl, driver.getCurrentUrl());
    }

    @Then("user got error message")
    public void userGotErrorMessage() {
        assertTrue(loginPage.getErrorMessage());
    }
}
