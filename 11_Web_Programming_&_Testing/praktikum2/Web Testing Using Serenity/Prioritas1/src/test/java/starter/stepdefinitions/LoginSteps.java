package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid username")
    public void inputValidUserName(){
        loginPage.inputUsername("standard_user");
    }
    @When("I input locked username")
    public void inputLockedUsername(){
        loginPage.inputUsername("locked_out_user");
    }
    @When("I input {string} username")
    public void iInputUsername(String username) {
        loginPage.inputUsername(username);
    }
    @When("I input unregistered username")
    public void inputUnregisteredUserName(){
        loginPage.inputUsername("testlogin");
    }
    @When("I input invalid username")
    public void inputInvalidUserName(){
        loginPage.inputUsername("iniusername");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("secret_sauce");
    }
    @And("I input invalid password")
    public void inputInvalidPassword(){
        loginPage.inputPassword("inipassword");
    }
    @And("I click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateHomePage();
    }

    @Then("I can see error message {string}")
    public void iCanSeeErrorMessage(String message) {
        loginPage.validateErrorMessageDisplayed();
        loginPage.validateEqualErrorMessage(message);
    }


}
