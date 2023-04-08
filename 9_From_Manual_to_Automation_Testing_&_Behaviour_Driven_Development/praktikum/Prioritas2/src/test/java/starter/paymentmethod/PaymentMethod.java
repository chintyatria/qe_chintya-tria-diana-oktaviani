package starter.paymentmethod;

import net.thucydides.core.annotations.Step;

public class PaymentMethod {
    @Step("I am on the payment method page")
    public void onThePaymentMethodPage(){
        System.out.println("I am on the payment method page");
    }

    @Step("I choose a payment method")
    public void choosePaymentMethod(){
        System.out.println("I choose a payment method");
    }

    @Step("I click bayar sekarang button")
    public void clickBayarSekarangButton(){
        System.out.println("I click bayar sekarang button");
    }

    @Step("Transaction success and being processed")
    public void transactionSuccess(){
        System.out.println("Transaction success and being processed");
    }
}
