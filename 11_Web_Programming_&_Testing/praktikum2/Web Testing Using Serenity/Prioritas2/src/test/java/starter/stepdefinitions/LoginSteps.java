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

    @Given("I am on the landing page")
    public void onTheLandingPage(){
        loginPage.openPage();
    }
    @When("I click masuk button")
    public void clickMasukButton(){
         loginPage.clickMasukButton();
    }
    @When("I input valid username")
    public void inputValidUserName(){
        loginPage.inputUsername("chintyaoktaviani53@gmail.com");
    }
    @When("I input {string} username")
    public void iInputUsername(String email) {
        loginPage.inputUsername(email);
    }
    @When("I input unregistered username")
    public void inputUnregisteredUserName(){
        loginPage.inputUsername("admin@gmail.com");
    }
    @When("I input invalid username")
    public void inputInvalidUserName(){
        loginPage.inputUsername("chintya@gmail.com");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Passwordtesting1@");
    }
    @And("I input invalid password")
    public void inputInvalidPassword(){
        loginPage.inputPassword("IniPassword@!!!33");
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
