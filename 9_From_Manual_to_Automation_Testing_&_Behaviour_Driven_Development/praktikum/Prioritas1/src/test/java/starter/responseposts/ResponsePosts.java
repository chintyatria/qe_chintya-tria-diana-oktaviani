package starter.responseposts;

import net.thucydides.core.annotations.Step;

public class ResponsePosts {
    @Step("I am on the main content of my home page")
    public void onTheMainContent(){
        System.out.println("I am on the main content of my home page");
    }

    @Step("I am scrolling any content on my home page")
    public void  scrollingAnyContent(){
        System.out.println("I am scrolling any content on my home page");
    }

    @Step("I click any react, comment, repost, share, or save any posts")
    public void clickOneOfTheReaction(){
        System.out.println("I click any react, comment, repost, share, or save any posts");
    }

    @Step("I can give anything i want to react")
    public void givingReaction(){
        System.out.println("I can give anything i want to react");
    }
}
