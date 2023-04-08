package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.dashboard.Dashboard;

public class DashboardSteps {

    @Steps
    Dashboard dashboard;

    @Given("I am on the dashboard page")
    public void onTheDashboardPage(){
        dashboard.onTheDashboardPage();
    }

    @When("I success login with my account")
    public void successLoginWithAccount(){
        dashboard.successLoginWithAccount();
    }

    @And("I explore all feature by scrolling and click feature that i want")
    public void exploreAllFeatureOnDashboard(){
        dashboard.exploreAllFeatureOnDashboard();
    }

    @Then("I can move to another page by clicking the menu or feature")
    public void moveToAnotherPage(){
        dashboard.moveToAnotherPage();
    }
}
