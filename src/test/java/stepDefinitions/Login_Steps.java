package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.Login_PO;


public class Login_Steps {
   private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I access bleucrm login page")
    public void i_access_bleucrm_login_page() {
        login_po.navigateToBleuCrmLoginPage();
    }
    @When("I enter a username {word}")
    public void i_enter_a_username(String username) {
        login_po.setUsername(username);
    }
    @And("I enter a password {word}")
    public void i_enter_a_password(String password) {
      login_po.setPassword(password);
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
        login_po.clickLoginButton();
    }
    @Then("I should be presented with the following {}")
    public void i_should_be_presented_with_the_following(String message) {
        login_po.validateSuccessfulLogin(message);
    }

    @Then("I should be presented with the warning message {}")
    public void i_should_be_presented_with_the_warning_message(String message) {
        login_po.validateUnsuccessfulLogin(message);
    }

}
