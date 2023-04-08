package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.follow.Follow;

public class FollowSteps {
    @Steps
    Follow follow;

    @Given("I am on the right sidebar in dashboard page")
    public void onRightSidebar(){
        follow.onRightSidebar();
    }

    @When("I see account recommendation to follow")
    public void seeAccountRecommendation(){
        follow.seeAccountRecommendation();
    }

    @And("I click the plus button")
    public void clickPlusButton(){
        follow.clickPlusButton();
    }

    @Then("I can already follow account that i want")
    public void alreadyFollow(){
        follow.alreadyFollow();
    }
}
