package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By transaction(){
        return By.className("headertrans");
    }
    private By inputData(){
        return By.id("phone_number");
    }
    private By selectPrice(){
        return By.id("Telkomsel Rp5.000");
    }
    @Step
    public void validateTransactionPage(){
        $(transaction()).isDisplayed();
    }
    @Step
    public void inputMyData(String phone_number){
        $(inputData()).type(phone_number);
    }
    @Step
    public void selectThePrice(){
        $(selectPrice()).click();
    }

}
