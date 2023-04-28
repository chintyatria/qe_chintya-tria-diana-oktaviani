package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    private By checkout(){
        return By.className("headertrans");
    }
    private By choosePaymentMethod(){
        return By.id("checkbox Gopay");
    }
    private By clickBayarButton(){
        return By.id("submit_payment");
    }
    private By paymentBarcode(){
        return By.id("react");
    }

    @Step
    public void validateCheckoutPage(){
        $(checkout()).isDisplayed();
    }
    @Step
    public void choosePayment(){
        $(choosePaymentMethod()).click();
    }
    @Step
    public void clickBayar(){
        $(clickBayarButton()).click();
    }
    @Step
    public void validatePaymentBarcodePage(){
        $(paymentBarcode()).isDisplayed();
    }
}
