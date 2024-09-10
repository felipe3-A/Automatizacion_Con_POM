package co.com.Aplication.StepsDefinitions;

import co.com.aplication.Steps.SocialSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SocialStepDefinition {

@Steps
    SocialSteps socialSteps;
    /*---------------------SOCIAL X---------------------------------*/

    @When("the user select a red X")
    public void theUserSelectARedX() {
        socialSteps.OpenSocialX();

    }
    @Then("the user seen the page web X's")
    public void theUserSeenThePageWebXS() {
        socialSteps.XValidate();
    }
    /*---------------------SOCIAL FACEBOOK---------------------------------*/
    @When("the user select a red facebook")
    public void theUserSelectARedFacebook() {
        socialSteps.openSocialFacebook();

    }
    @Then("the user seen the page web facebook")
    public void theUserSeenThePageWebFacebook() {
        socialSteps.FacebookValidate();
    }

    /*---------------------SOCIAL LINKEDIN---------------------------------*/

    @When("the user select a red Linkedin")
    public void theUserSelectARedLinkedin() {
        socialSteps.OpenSocialLinkedin();
    }
    @Then("the user seen the page Linkedin")
    public void theUserSeenThePageLinkedin() {
      socialSteps.LinkedinValidate();
    }

}
