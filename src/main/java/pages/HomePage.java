package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy( id ="react-burger-menu-btn")
    private WebElement menuBtn;
    @FindBy( id = "logout_sidebar_link")
    private WebElement logoutBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {
        menuBtn.click();
    }

    public void logout() {
        logoutBtn.click();
    }

}
