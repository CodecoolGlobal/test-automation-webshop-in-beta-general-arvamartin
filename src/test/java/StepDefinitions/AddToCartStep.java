package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProductDescriptionPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCartStep {

    private WebDriver driver = BaseTest.getDriver();
    private HomePage homePage = new HomePage(driver);
    private ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver);

    @When("user clicks on add to cart button for a product")
    public void userClicksOnAddToCartButton() {
        homePage.addFirstChosenProductToCart();
    }

    @When("user clicks on add to cart button for another product")
    public void userClicksOnAddToCartButtonForAnotherProduct() {
        homePage.addSecondChosenProductToCart();
    }

    @When("user click on the remove button for the first added product")
    public void userClickOnTheRemoveButtonForTheFirstAddedProduct() {
        homePage.removeFirstProductFromCart();
    }

    @When("user add product to the cart")
    public void userAddProductToTheCart() {
        productDescriptionPage.clickAddToCartBtn();
    }

    @When("navigate back to the home page")
    public void navigateBackToTheHomePage() {
        productDescriptionPage.clickBackToProductsBtn();
    }

    @Then("user sees {int} product on the shopping cart icon")
    public void userSeesTwoProductsOnTheShoppingCartIcon(int numOfProducts) {
        assertEquals(numOfProducts, homePage.getShoppingCartProductsCount());
    }
}
