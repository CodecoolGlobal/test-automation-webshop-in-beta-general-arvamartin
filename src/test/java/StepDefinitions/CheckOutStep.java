package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.YourCartPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutStep {

    private WebDriver driver = BaseTest.getDriver();
    private HomePage homePage = new HomePage(driver);
    private YourCartPage yourCartPage = new YourCartPage(driver);

    @When("user clicks on the shopping cart icon")
    public void userClicksOnTheShoppingCartIcon() {
        homePage.clickOnShoppingCartIcon();
    }

    @When("user clicks on the checkout button")
    public void userClicksOnTheCheckoutButton() {
        yourCartPage.clickOnCheckoutBtn();
    }

    @When("user enters {string} as first name")
    public void userEntersAsFirstName(String firstName) {
        yourCartPage.enterFirstName(firstName);
    }

    @When("user enters {string} as last name")
    public void userEntersAsLastName(String lastName) {
        yourCartPage.enterLastName(lastName);
    }

    @When("user enters {string} as postal code")
    public void userEntersAsPostalCode(String postalCode) {
        yourCartPage.enterPostalCode(postalCode);
    }

    @When("user clicks on the continue button")
    public void userClicksOnTheContinueButton() {
        yourCartPage.clickContinueBtn();
    }

    @When("user clicks on the finish button")
    public void userClicksOnTheFinishButton() {
        yourCartPage.clickFinishBtn();
    }

    @Then("user get {string} message")
    public void userGetMessage(String message) {
        assertEquals(message, yourCartPage.getCompleteMessage());
    }
}
