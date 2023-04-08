package starter.dashboard;

import net.thucydides.core.annotations.Step;

public class Dashboard {

    @Step("I am on the dashboard page")
    public void onTheDashboardPage(){
        System.out.println("I am on the dashboard page");
    }

    @Step("I success login with my account")
    public void  successLoginWithAccount(){
        System.out.println("I success login with my account");
    }

    @Step("I explore all feature by scrolling and click feature that i want")
    public void exploreAllFeatureOnDashboard(){
        System.out.println("I explore all feature by scrolling and click feature that i want");
    }

    @Step("I can move to another page by clicking the menu or feature")
    public void moveToAnotherPage(){
        System.out.println("I can move to another page by clicking the menu or feature");
    }
}
