package starter.post;

import net.thucydides.core.annotations.Step;

public class Post {
    @Step("I am on the posting feature in  the dashboard")
    public void onThePostingFeature(){
        System.out.println("I am on the posting feature in  the dashboard");
    }

    @Step("I click input field to start my post")
    public void  clickInputFieldToPosting(){
        System.out.println("I click input field to start my post");
    }

    @Step("I start typing any post")
    public void typingAnyPost(){
        System.out.println("I start typing any post");
    }

    @Step("I can see and share my posts")
    public void seeAndShareThePost(){
        System.out.println("I can see and share my posts");
    }
}
