package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.message.Message;

public class MessageSteps {
    @Steps
    Message message;

    @Given("I am on the message feature")
    public void onTheMessageFeature(){
        message.onTheMessageFeature();
    }

    @When("I click my friend's profile and write some message to send")
    public void clickFriendsProfileAndWriteTheMessage(){
        message.clickFriendsProfileAndWriteTheMessage();
    }

    @And("I click send button to sending my message")
    public void clickSendButton(){
        message.clickSendButton();
    }

    @Then("I can chatting with my friend")
    public void successChattingWithFriend(){
        message.successChattingWithFriend();
    }
}
