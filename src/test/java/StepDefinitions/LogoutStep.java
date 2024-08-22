package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogoutStep {

    private WebDriver driver = BaseTest.getDriver();
    private LoginPage loginPage;
    private HomePage homePage;



    @Given("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.userEntersUsername(username);
        loginPage.userEntersPassword(password);
        homePage = new HomePage(driver);
    }

    @When("user clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
        homePage.openMenu();
        homePage.logout();

    }

    @Then("user is on desired the {string} page")
    public void user_is_on_the_page(String page) {
        assertEquals(page,driver.getCurrentUrl());
    }
}
