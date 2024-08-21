package StepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductListingStep {

    private BaseTest baseTest = new BaseTest();
    private WebDriver driver =  baseTest.getDriver();
    private HomePage homePage = new HomePage(driver);

    @Then("user can see the product list")
    public void userCanSeeTheProductList() {
        assertTrue(homePage.checkProductList());
    }
}
