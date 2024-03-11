package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CreateNewTask_PO extends Base_PO{
    private @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    WebElement taskTitleBox;
    private @FindBy(xpath = "//div[@id=\"bx-html-editor-iframe-cnt-lifefeed_task_form\"]/iframe")
    WebElement iframeLocator;
    private @FindBy(xpath = "/html/body")
    WebElement taskTextBox;
    private @FindBy(id = "blog-submit-button-save")
    WebElement taskSendButton;
    private @FindBy(id = "blogPostEditCreateTaskPopup_content")
    WebElement popupText;
    private @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    WebElement popupCloseButton;

    public CreateNewTask_PO(){
        super();
    }

    public void setTaskTitle(String title) {
        sendKeys(taskTitleBox,title);
    }

    public void setTaskText(String text) {
        getDriver().switchTo().frame(iframeLocator);
        sendKeys(taskTextBox,text);
        getDriver().switchTo().parentFrame();
    }

    public void sendTask() {
        clickElement(taskSendButton);
    }

    public void validateNewTask() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupText));
        Assert.assertEquals(popupText.getText(),"Task has been created\nYou can now view and edit the task.");
        clickElement(popupCloseButton);
    }


}
