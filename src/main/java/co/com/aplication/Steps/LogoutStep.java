package co.com.aplication.Steps;

import co.com.aplication.Pages.LogoutPage;
import net.thucydides.core.annotations.Step;

public class LogoutStep {
    LogoutPage logoutPage;
    @Step
    public void goButton() {
        logoutPage.getDriver().findElement(logoutPage.getBTN_HAMBURGER()).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logoutPage.getDriver().findElement(logoutPage.getA_LOGOUT()).click();
    }
    @Step
    public void VeryfyLogout(){
        logoutPage.getDriver().findElement(logoutPage.getBTN_VERIFY()).isDisplayed();
    }
}
