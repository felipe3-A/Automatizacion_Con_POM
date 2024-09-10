package co.com.Aplication.StepsDefinitions;


import co.com.aplication.Models.LoginData;
import co.com.aplication.Steps.LoginSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;
import java.util.Map;

public class LoginStepsDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Given("he user enter in teh page")
    public void heUserEnterInTehPage() {
    loginSteps.OpenPage();
    }

    @DataTableType
    public LoginData loginDataEntry(Map<String, String> entry) {
        LoginData loginData = new LoginData();
        loginData.setUser(entry.get("user"));
        loginData.setPassword(entry.get("password"));
        return loginData;
    }


    @When("he user enter the credentials")
    public void heUserEnterTheCredentials(DataTable dataTable) {
        List<LoginData> loginDataList=dataTable.asList(LoginData.class);
        LoginData loginData=loginDataList.get(0);
        loginSteps.enterUser(loginData.getUser());
        loginSteps.enterPassword(loginData.getPassword());
        loginSteps.clickLogin();
    }
    @Then("he user could login")
    public void heUserCouldLogin() {
        loginSteps.verifyText();
    }
}
