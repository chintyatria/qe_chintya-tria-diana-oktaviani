package starter.pilihproduk;

import net.thucydides.core.annotations.Step;

public class PilihProduk {
    @Step("I am on the dashboard page")
    public void onTheDashboardPage(){
        System.out.println("I am on the dashboard page");
    }

    @Step("I choose a product that i want")
    public void chooseProduct(){
        System.out.println("I choose a product that i want");
    }

    @Step("I enter my phone number and select a package")
    public void enterPhoneNumber(){
        System.out.println("I enter my phone number and select a package");
    }

    @Step("I am on the payment page")
    public void onThePaymentPage(){
        System.out.println("I am on the payment page");
    }
}
