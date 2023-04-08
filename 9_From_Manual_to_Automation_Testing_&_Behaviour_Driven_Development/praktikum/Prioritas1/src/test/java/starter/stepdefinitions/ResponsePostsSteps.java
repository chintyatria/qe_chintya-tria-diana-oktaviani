package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.responseposts.ResponsePosts;

public class ResponsePostsSteps {
    @Steps
    ResponsePosts responseposts;

    @Given("I am on the main content of my home page")
    public void onTheMainContent(){
        responseposts.onTheMainContent();
    }

    @When("I am scrolling any content on my home page")
    public void scrollingAnyContent(){
        responseposts.scrollingAnyContent();
    }

    @And("I click any react, comment, repost, share, or save any posts")
    public void clickOneOfTheReaction(){
        responseposts.clickOneOfTheReaction();
    }

    @Then("I can give anything i want to react")
    public void givingReaction(){
        responseposts.givingReaction();
    }
}
