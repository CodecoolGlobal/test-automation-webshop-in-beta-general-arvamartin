package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.ui.Select;


public class HomePage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutBtn;
    @FindBy(id = "inventory_container")
    private WebElement productsListContainer;
    @FindBy(xpath = "//*[@id=\"item_4_img_link\"]")
    private WebElement firstProduct;
    @FindBy(className = "product_sort_container")
    private WebElement productsSortContainer;
    @FindBy(css = "select.product_sort_container option[value='lohi']")
    private WebElement lowToHighSort;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement firstProductToAddToCartBtn;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement secondProductToAddToCartBtn;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {
        wait(menuBtn).click();
    }

    public void logout() {
        wait(logoutBtn).click();
    }

    public boolean checkProductList() {
        return productsListContainer.isDisplayed();
    }

    public void clickOnFirstProduct() {
        firstProduct.click();
    }

    public void clickOnProductsSortBtn() {
        wait(productsSortContainer).click();
    }

    public void clickOnLowToHighSort() {
        wait(lowToHighSort).click();
    }

    public void sortProducts() {
        clickOnProductsSortBtn();
        clickOnLowToHighSort();
    }

    public String getProductsSortBtnText() {
        Select select = new Select(productsSortContainer);
        return select.getFirstSelectedOption().getText();
    }

    public void addFirstChosenProductToCart() {
        wait(firstProductToAddToCartBtn).click();
    }

    public void addSecondChosenProductToCart() {
        wait(secondProductToAddToCartBtn).click();
    }

    public int getShoppingCartProductsCount() {
        return Integer.parseInt(shoppingCartLink.getText());

    }

    public boolean isMenuBtnDisplayed() {
        try {
            return menuBtn.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

