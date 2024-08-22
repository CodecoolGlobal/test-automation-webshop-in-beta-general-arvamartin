package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage {


    @FindBy(id = "checkout")
    private WebElement checkoutBtn;
    @FindBy(id = "first-name")
    private WebElement firstNameField;
    @FindBy(id = "last-name")
    private WebElement lastNameField;
    @FindBy(id = "postal-code")
    private WebElement postalCodeField;
    @FindBy(id = "continue")
    private WebElement continueBtn;
    @FindBy(id = "finish")
    private WebElement finishBtn;
    @FindBy(className = "complete-header")
    private WebElement completeMessage;

    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCheckoutBtn() {
        wait(checkoutBtn).click();
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }
    public void clickContinueBtn() {
        continueBtn.click();
    }
    public void clickFinishBtn() {
        finishBtn.click();
    }
    public String getCompleteMessage(){
        return wait(completeMessage).getText();
    }
}
