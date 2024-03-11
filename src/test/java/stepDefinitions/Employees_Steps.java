package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Employees_PO;
import pageObjects.Home_PO;
import pageObjects.Login_PO;

public class Employees_Steps {
    Login_PO login_po = new Login_PO();
    Home_PO home_po = new Home_PO();
    Employees_PO employees_po = new Employees_PO();

    @Given("I access bleuCrm login page")
    public void i_access_bleu_crm_login_page() {
        login_po.navigateToBleuCrmLoginPage();
    }
    @Given("I enter username {string}")
    public void i_enter_username(String username) {
        login_po.setUsername(username);
    }
    @Given("I enter password {string}")
    public void i_enter_password(String password) {
        login_po.setPassword(password);
    }
    @Given("I click the loginButton")
    public void i_click_the_login_button() {
        login_po.clickLoginButton();
    }
    @Given("I click the employees button")
    public void i_click_the_employees_button() {
        home_po.navigateToEmployeesMenu();
    }
    @Then("I should be presented with the module list")
    public void i_should_be_presented_with_the_module_list() {
        employees_po.verifyModules();
    }

    @When("I click add department button")
    public void i_click_add_department_button() {
        employees_po.clickAddNewDepartmentButton();
    }
    @And("I enter department name {string}")
    public void i_enter_department_name(String departmentName) {
        employees_po.setDepartmentName(departmentName);
    }
    @And("I click add button")
    public void i_click_add_button() {
        employees_po.confirmAddDepartment();
    }

}
