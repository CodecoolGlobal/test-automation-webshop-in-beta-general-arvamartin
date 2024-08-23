package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement usernameField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    @FindBy(css = "div.error-message-container.error")
    public WebElement errorMessageContainer;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void userEntersUsername(String username) {
        wait((usernameField)).sendKeys(username);
    }

    public void userEntersPassword(String password) {
        wait((passwordField)).sendKeys(password);
    }

    public void userClicksOnLoginBtn() {
        loginButton.click();
    }

    public boolean getErrorMessage() {
        return errorMessageContainer.isDisplayed();
    }
}
