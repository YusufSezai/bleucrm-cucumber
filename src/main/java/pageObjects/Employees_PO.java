package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees_PO extends Base_PO{

    private @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    List<WebElement> modulesList;
    private @FindBy(xpath = "//span[@class='webform-small-button-text']")
    WebElement addDepartmentButton;
    private @FindBy(id = "NAME")
    WebElement addDepartmentTextBox;
    private @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    WebElement addButton;

    public Employees_PO(){
        super();
    }

    public void verifyModules() {
        String[] expectedModules = {"Company Structure", "Find Employee", "Telephone Directory",
                "Staff Changes", "Efficiency Report", "Honored Employees", "Birthdays", "New page"};
        List<String> actualModules = new ArrayList<String>();

        for (WebElement element : modulesList) {
            actualModules.add(element.getText());
        }
        Assert.assertEquals(actualModules,Arrays.asList(expectedModules));
    }

    public void clickAddNewDepartmentButton() {
        clickElement(addDepartmentButton);
    }

    public void setDepartmentName(String departmentName) {
        sendKeys(addDepartmentTextBox,departmentName);
    }

    public void confirmAddDepartment() {
        clickElement(addButton);
    }

}
