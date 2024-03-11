package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Vars;

import java.time.Duration;

public class Login_PO extends Base_PO{


    private @FindBy(xpath = "//input[@name='USER_LOGIN']")
    WebElement usernameTextBox;
    private @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    WebElement passwordTextBox;
    private @FindBy(xpath = "//input[@class='login-btn']")
    WebElement loginButton;
    private @FindBy(xpath = "//span[@class='menu-item-link-text']")
    WebElement successfulLoginMessage;
    private @FindBy(xpath = "//div[@class='errortext']")
    WebElement warningMessage;

    public Login_PO() {
        super();
    }

    public void navigateToBleuCrmLoginPage() {
        navigateToUrl(Global_Vars.URL);
    }

    public void setUsername(String username) {

        sendKeys(usernameTextBox,username);
    }

    public void setPassword(String password) {
        sendKeys(passwordTextBox,password);
    }

    public void clickLoginButton() {

        clickElement(loginButton);
    }

    public void validateSuccessfulLogin(String message) {
        waitForElementVisibleAndValidate(successfulLoginMessage,message);
    }

    public void validateUnsuccessfulLogin(String message) {
        waitForElementVisibleAndValidate(warningMessage,message);
    }

}
