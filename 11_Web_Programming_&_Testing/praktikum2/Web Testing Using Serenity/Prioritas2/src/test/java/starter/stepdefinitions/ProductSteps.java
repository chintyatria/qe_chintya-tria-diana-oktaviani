package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CheckoutPage;
import starter.pages.HomePage;
import starter.pages.ProductPage;
import starter.pages.TransactionPage;

public class ProductSteps {
    @Steps
    ProductPage productPage;
    @Steps
    CheckoutPage checkoutPage;
    @Steps
    TransactionPage transactionPage;
    @When("I select any item")
    public void selectItem(){
        productPage.selectItem();
    }
    @And("I am on the transaction page")
    public void onTransactionPage (){
        transactionPage.validateTransactionPage();
    }
    @And("I input my data")
    public void inputMyData(){
        transactionPage.inputMyData("082245656274");
    }
    @And("I select the price")
    public void selectPrice(){
        transactionPage.selectThePrice();
    }
    @Then("I am on the checkout page")
    public void onCheckoutPage(){
        checkoutPage.validateCheckoutPage();
    }
}
