package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.Post;

public class PostSteps {
    @Steps
    Post post;

    @Given("I am on the posting feature in  the dashboard")
    public void onThePostingFeature(){
        post.onThePostingFeature();
    }

    @When("I click input field to start my post")
    public void clickInputFieldToPosting(){
        post.clickInputFieldToPosting();
    }

    @And("I start typing any post")
    public void typingAnyPost(){
        post.typingAnyPost();
    }

    @Then("I can see and share my posts")
    public void seeAndShareThePost(){
        post.seeAndShareThePost();
    }
}
