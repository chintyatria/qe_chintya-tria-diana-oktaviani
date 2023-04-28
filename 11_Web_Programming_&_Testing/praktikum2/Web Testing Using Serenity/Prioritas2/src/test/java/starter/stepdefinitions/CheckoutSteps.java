package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CheckoutPage;

public class CheckoutSteps {
    @Steps
    CheckoutPage checkoutPage;

    @When("I choose payment Method")
    public void choosePaymentMethod(){
        checkoutPage.choosePayment();
    }
    @And("I click bayar button")
    public void clickBayarButton(){
        checkoutPage.clickBayar();
    }
    @Then("I see payment barcode")
    public void paymentBarcodePage(){
        checkoutPage.validatePaymentBarcodePage();
    }
}
