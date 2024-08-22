package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    @FindBy( id ="react-burger-menu-btn")
    private WebElement menuBtn;
    @FindBy( id = "logout_sidebar_link")
    private WebElement logoutBtn;
    @FindBy(id = "inventory_container")
    private WebElement productsListContainer;
    @FindBy(xpath = "//*[@id=\"item_4_img_link\"]")
    private WebElement firstProduct;

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

    public boolean isMenuBtnDisplayed() {
        try {
            return menuBtn.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
