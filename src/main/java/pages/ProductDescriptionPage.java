package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends BasePage {
    @FindBy( id = "back-to-products")
    private WebElement backToProductsBtn;
    @FindBy( id="add-to-cart")
    private WebElement addToCartBtn;

    public ProductDescriptionPage(WebDriver driver) {
        super(driver);
    }

    public void clickBackToProductsBtn() {
        backToProductsBtn.click();
    }

    public void clickAddToCartBtn() {
        addToCartBtn.click();
    }
}
