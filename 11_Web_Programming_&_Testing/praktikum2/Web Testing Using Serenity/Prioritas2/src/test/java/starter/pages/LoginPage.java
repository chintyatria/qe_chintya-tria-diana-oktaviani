package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){
        return By.id("email");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By loginButton(){
        return By.className("signup-button");
    }
    private By errorMessage(){
        return By.id("alert_description");
    }
    private By masukButton(){
        return By.id("button_signin_home");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void clickMasukButton(){
        $(masukButton()).click();
    }
//    @Step
//    public void validateOnLoginPage(){
//        $(masukButton()).isDisplayed();
//    }
    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
}
