package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.*;

public class ProductListingStep {


    private WebDriver driver =  BaseTest.getDriver();
    private HomePage homePage = new HomePage(driver);



    @When("user is on the {string} home page")
    public void userIsOnTheHomePage(String homePage) {
        assertEquals(homePage, driver.getCurrentUrl());
    }
    
    @Then("user can see the product list")
    public void userCanSeeTheProductList() {
        assertTrue(homePage.checkProductList());
    }

    @When("user selects the low to high sorting method")
    public void userSelectsTheLowToHighSortingMethod() {
        homePage.sortProducts();
    }

    @Then("user sees products in low to high sorting")
    public void userSeesProductsInLowToHighSorting() {
        String selectedSortingText = homePage.getProductsSortBtnText();
        assertEquals("Price (low to high)", selectedSortingText);
    }
}
