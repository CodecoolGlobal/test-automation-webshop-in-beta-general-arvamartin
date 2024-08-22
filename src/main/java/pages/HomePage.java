package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    @FindBy( id ="react-burger-menu-btn")
    private WebElement menuBtn;
    @FindBy( id = "logout_sidebar_link")
    private WebElement logoutBtn;
    @FindBy(id = "inventory_container")
    private WebElement productsListContainer;



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

}
