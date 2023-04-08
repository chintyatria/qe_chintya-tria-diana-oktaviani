package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.previewprofile.PreviewProfile;

public class PreviewProfileSteps {
    @Steps
    PreviewProfile previewprofile;

    @Given("I am on the left sidebar in dashboard page")
    public void onLeftSidebar(){
        previewprofile.onLeftSidebar();
    }

    @When("I see the left sidebar in the dashboard page")
    public void seeLeftSidebar(){
        previewprofile.seeLeftSidebar();
    }

    @And("I click any sub feature on the left sidebar in the dashboard page")
    public void clickAnySubFeature(){
        previewprofile.clickAnySubFeature();
    }

    @Then("I can see any information from the sub feature that i click")
    public void seeAnyInformation(){
        previewprofile.seeAnyInformation();
    }
}
