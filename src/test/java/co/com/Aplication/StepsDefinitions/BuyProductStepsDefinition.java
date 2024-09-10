package co.com.Aplication.StepsDefinitions;

import co.com.aplication.Models.BuyData;
import co.com.aplication.Models.LoginData;
import co.com.aplication.Steps.BuyProductsSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class BuyProductStepsDefinition {

    @Steps
    BuyProductsSteps buyProductsSteps;
    @When("he user select a product")
    public void heUserSelectAProduct(DataTable dataTable) {
        List<LoginData> loginDataList = dataTable.asList(LoginData.class);
        LoginData loginData = loginDataList.get(0);
        buyProductsSteps.LoginEnter(loginData.getUser(), loginData.getPassword());
        buyProductsSteps.openBuyProductsPage();
    }

    @DataTableType
    public BuyData buyDataTransformer(Map<String, String> entry) {
        BuyData buyData = new BuyData();
        buyData.setName(entry.get("name"));
        buyData.setLast_name(entry.get("last_name"));
        buyData.setZip(entry.get("zip"));
        return buyData;
    }


    @When("he user complete the dates for the buy")
    public void heUserCompleteTheDatesForTheBuy(DataTable dataTable1) {
        List<BuyData> buyDataList = dataTable1.asList(BuyData.class);
        BuyData buyData = buyDataList.get(0);
        buyProductsSteps.openCard();
        buyProductsSteps.goToRegister();
        buyProductsSteps.registerProduct(
                buyData.getName(),
                buyData.getLast_name(),
                buyData.getZip());

        buyProductsSteps.navigateContinue();
    }



    @Then("he user seen the products")
    public void heUserSeenTheProducts() {
       buyProductsSteps.BuyComplete();
    }


    /*--------------- Delete Product -----------------------------------------------------------*/
    @When("the user select a product for delete")
    public void theUserSelectAProductForDelete() {
        buyProductsSteps.openCard();
        buyProductsSteps.deleteProduct();
    }
    @Then("the user would have deleted a product")
    public void theUserWouldHaveDeletedAProduct() {
        buyProductsSteps.VerifyProcess();
    }

    /*------------------------------------------SEE PRODUCT-----------------------------------------------------*/

    @When("the user select a product")
    public void theUserSelectAProduct() {
    buyProductsSteps.SelectProduct();
    buyProductsSteps.openCard();

    }
    @Then("the user seen info the product")
    public void theUserSeenInfoTheProduct() {
    buyProductsSteps.SeeProduct();
    }

    /*------------------------------------------REGISTER THE USER INCOMPLETE-----------------------------------------------------*/

    @When("the user ignore a buttons")
    public void theUserIgnoreAButtons() {
      buyProductsSteps.openCard();
      buyProductsSteps.goToRegister();
      buyProductsSteps.GotoContinue();

    }
    @Then("the user seen ia message error")
    public void theUserSeenIaMessageError() {
    buyProductsSteps.MessageError();
    }



}
