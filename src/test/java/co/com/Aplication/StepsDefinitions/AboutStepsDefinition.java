package co.com.Aplication.StepsDefinitions;

import co.com.aplication.Steps.AboutSteps;
import io.cucumber.java.en.*;

public class AboutStepsDefinition {
    AboutSteps aboutSteps;

    @When("the user go to layout About")
    public void theUserGoToLayoutAbout() {
    aboutSteps.goBotonHamburger();
    aboutSteps.goAabout();
    }

    @Then("the user will see the layout the About")
    public void theUserWillSeeTheLayoutTheAbout() {
    aboutSteps.ValidationImage();
    }
}
