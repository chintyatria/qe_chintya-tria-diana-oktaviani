package starter.message;

import net.thucydides.core.annotations.Step;

public class Message {
    @Step("I am on the message feature")
    public void onTheMessageFeature(){
        System.out.println("I am on the message feature");
    }

    @Step("I click my friend's profile and write some message to send")
    public void  clickFriendsProfileAndWriteTheMessage(){
        System.out.println("I click my friend's profile and write some message to send");
    }

    @Step("I click send button to sending my message")
    public void clickSendButton(){
        System.out.println("I click send button to sending my message");
    }

    @Step("I can chatting with my friend")
    public void successChattingWithFriend(){
        System.out.println("I can chatting with my friend");
    }
}
