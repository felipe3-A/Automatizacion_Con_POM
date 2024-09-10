package co.com.Aplication.StepsDefinitions;

import co.com.aplication.Steps.SearchSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchStepsDefinition {
    @Steps
    SearchSteps searchSteps;

    @When("the user select the select list")
    public void theUserSelectTheSelectList() {
    searchSteps.SelectList();
    searchSteps.SelectOption();
    }
    @Then("the user seen info")
    public void theUserSeenInfo() {
    searchSteps.ValidateSearch();
    }

}
