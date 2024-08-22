package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductDescriptionStep {

    private WebDriver driver = BaseTest.getDriver();
    private HomePage homePage = new HomePage(driver);

    @When("user clicks on the first product")
    public void user_clicks_on_the_first_product() {
        homePage.clickOnFirstProduct();
    }

    @Then("user can see details of the specific product")
    public void user_can_see_details_of_the_specific_product() {
        assertNotEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }
}
