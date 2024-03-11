package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateNewTask_PO;
import pageObjects.Home_PO;

public class Creat_Task_From_HomePage_Steps {
    Home_PO home_po = new Home_PO();
    CreateNewTask_PO createNewTask_po = new CreateNewTask_PO();

    @When("I click the Task button")
    public void i_click_the_task_button() {
        home_po.navigateToQuickTaskCreate();
    }

    @And("I enter task title {string}")
    public void i_enter_task_title(String title) {
       createNewTask_po.setTaskTitle(title);
    }

    @And("I enter task content {string}")
    public void i_enter_task_content(String text) {
        createNewTask_po.setTaskText(text);
    }

    @And("I click send button")
    public void i_click_send_button() {
        createNewTask_po.sendTask();
    }

    @Then("I should be presented with the popup")
    public void i_should_be_presented_with_the_popup() {
        createNewTask_po.validateNewTask();
    }
}
