package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCartStep {

    private WebDriver driver = BaseTest.getDriver();
    private HomePage homePage = new HomePage(driver);

    @When("user clicks on add to cart button for a product")
    public void userClicksOnAddToCartButton() {
        homePage.addFirstChosenProductToCart();
    }

    @And("user clicks on add to cart button for another product")
    public void userClicksOnAddToCartButtonForAnotherProduct() {
        homePage.addSecondChosenProductToCart();
    }

    @Then("user sees two products on the shopping cart icon")
    public void userSeesTwoProductsOnTheShoppingCartIcon() {
        int expectedNumberOfProducts = 2;
        assertEquals(expectedNumberOfProducts, homePage.getShoppingCartProductsCount());
    }
}
