package co.com.Aplication.StepsDefinitions;

import co.com.aplication.Steps.LogoutStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutStepDefinition {

    @Steps
    LogoutStep logoutStep;

    @When("he user go to Logout")
    public void heUserGoToLogout() {
    logoutStep.goButton();
    }

    @Then("the user cold to be logout")
    public void theUserColdToBeLogout() {
    logoutStep.VeryfyLogout();
    }
}
