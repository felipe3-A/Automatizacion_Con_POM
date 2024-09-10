package co.com.Aplication.StepsDefinitions;

import co.com.aplication.Models.LoginData;
import co.com.aplication.Steps.LoginSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

@Slf4j
public class LoginIncorrectStepsDefinition {

    @Steps
    LoginSteps loginSteps;


    @When("he user enter the credentials incorrects")
    public void heUserEnterTheCredentialsIncorrects(DataTable dataTable) {
        List<LoginData> loginDataList= dataTable.asList(LoginData.class);
        LoginData loginData = loginDataList.get(0);
        loginSteps.enterUser(loginData.getUser());
        loginSteps.enterPassword(loginData.getPassword());
        loginSteps.clickLogin();
    }
    @Then("he user not could login")
    public void heUserNotCouldLogin() {
     loginSteps.verifyError();

    }
}
