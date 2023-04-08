package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.paymentmethod.PaymentMethod;

public class PaymentMethodSteps {
    @Steps
    PaymentMethod paymentmethod;

    @Given("I am on the payment method page")
    public void onThePaymentMethodPage(){
        paymentmethod.onThePaymentMethodPage();
    }
    @When("I choose a payment method")
    public void choosePaymentMethod(){
        paymentmethod.choosePaymentMethod();
    }
    @And("I click bayar sekarang button")
    public void clickBayarSekarangButton(){
        paymentmethod.clickBayarSekarangButton();
    }
    @Then("Transaction success and being processed")
    public void transactionSuccess(){
        paymentmethod.transactionSuccess();
    }
}
