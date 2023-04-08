package starter.previewprofile;

import net.thucydides.core.annotations.Step;

public class PreviewProfile {
    @Step("I am on the left sidebar in dashboard page")
    public void onLeftSidebar(){
        System.out.println("I am on the left sidebar in dashboard page");
    }

    @Step("I see the left sidebar in the dashboard page")
    public void  seeLeftSidebar(){
        System.out.println("I see the left sidebar in the dashboard page");
    }

    @Step("I click any sub feature on the left sidebar in the dashboard page")
    public void clickAnySubFeature(){
        System.out.println("I click any sub feature on the left sidebar in the dashboard page");
    }

    @Step("I can see any information from the sub feature that i click")
    public void seeAnyInformation(){
        System.out.println("I can see any information from the sub feature that i click");
    }
}
