package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pilihproduk.PilihProduk;

public class PilihProdukSteps {
    @Steps
    PilihProduk pilihproduk;

    @Given("I am on the dashboard page")
    public void onTheDashboardPage(){
        pilihproduk.onTheDashboardPage();
    }
    @When("I choose a product that i want")
    public void chooseProduct(){
        pilihproduk.chooseProduct();
    }
    @And("I enter my phone number and select a package")
    public void enterPhoneNumber(){
        pilihproduk.enterPhoneNumber();
    }
    @Then("I am on the payment page")
    public void onThePaymentPage(){
        pilihproduk.onThePaymentPage();
    }
}
