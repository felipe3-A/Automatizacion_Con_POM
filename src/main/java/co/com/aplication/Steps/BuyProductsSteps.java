package co.com.aplication.Steps;

import co.com.aplication.Pages.BuyProductsPage;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;

import javax.swing.text.html.parser.Element;

@Slf4j
public class BuyProductsSteps {

    BuyProductsPage buyProductsPage;

    @Step
    public void LoginEnter(String user, String pass) {
        buyProductsPage.getDriver().findElement(buyProductsPage.getUSER_LOGIN()).sendKeys(user);
        buyProductsPage.getDriver().findElement(buyProductsPage.getPASSWORD_LOGIN()).sendKeys(pass);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

            buyProductsPage.getDriver().findElement(buyProductsPage.getBUTTON_LOGIN()).click();
    }
    @Step
    public void openBuyProductsPage() {
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_PRODUCT_1()).click();
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_PRODUCT_2()).click();
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        buyProductsPage.getDriver().findElement(buyProductsPage.getA_CAR_SHOP()).click();
    }
    @Step
    public void openCard(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getA_CAR_SHOP()).click();

    }

    @Step
    public void goToRegister(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getTEXT_VERIFY_BUY()).click();
    }

    @Step
    public void deleteProduct() {
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_DELETE1()).click();
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_DELETE2()).click();

    }

    @Step
    public void VerifyProcess() {
        buyProductsPage.getDriver().findElement(buyProductsPage.getA_CAR_SHOP()).isDisplayed();

    }


    @Step
    public void registerProduct(String name, String last_name,String zip){

        buyProductsPage.getDriver().findElement(buyProductsPage.getTEXT_NAME()).sendKeys(name);
        buyProductsPage.getDriver().findElement(buyProductsPage.getTEXT_LAST_NAME()).sendKeys(last_name);
        buyProductsPage.getDriver().findElement(buyProductsPage.getTEXT_ZIP_CODE()).sendKeys(zip);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}


    }
    @Step
    public void navigateContinue(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_CONTINUE()).click();
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_FINISH()).click();
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
    }


    @Step
    public void BuyComplete(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getIMG_VALIDATION()).isDisplayed();
    }

    @Step
    public void SelectProduct(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getIMG_PRODUCT()).click();
        buyProductsPage.getDriver().findElement(buyProductsPage.getADD_PRODUCT()).click();
    }

    @Step
    public void SeeProduct(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getTEXT_VERIFY_BUY()).isDisplayed();
    }

    @Step
    public void GotoContinue(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getBTN_CONTINUE()).click();
    }

    @Step
    public void MessageError(){
        buyProductsPage.getDriver().findElement(buyProductsPage.getMESSAGE_ERROR()).isDisplayed();
    }



}
