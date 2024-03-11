package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Home_PO extends Base_PO{

    private @FindBy(xpath = "//a[@title='Employees']")
    WebElement employeesButton;
    private @FindBy(id = "feed-add-post-form-tab-tasks")
    WebElement taskButton;


    public Home_PO() {
        super();
    }

    public void navigateToEmployeesMenu() {
        clickElement(employeesButton);
    }

    public void navigateToQuickTaskCreate() {
        clickElement(taskButton);
    }

}
