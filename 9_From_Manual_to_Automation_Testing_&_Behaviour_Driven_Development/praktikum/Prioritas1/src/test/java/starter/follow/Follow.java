package starter.follow;

import net.thucydides.core.annotations.Step;

public class Follow {
    @Step("I am on the right sidebar in dashboard page")
    public void onRightSidebar(){
        System.out.println("I am on the right sidebar in dashboard page");
    }

    @Step("I see account recommendation to follow")
    public void  seeAccountRecommendation(){
        System.out.println("I view account recommendation to follow");
    }

    @Step("I click the plus button")
    public void clickPlusButton(){
        System.out.println("I click the plus button");
    }

    @Step("I can already follow account that i want")
    public void alreadyFollow(){
        System.out.println("I can already follow account that i want");
    }
}
