package co.com.aplication.Steps;

import co.com.aplication.Pages.SocialPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SocialSteps {
    SocialPage socialPage;

    @Step
    public void openSocialFacebook() {
        WebElement link = socialPage.getDriver().findElement(socialPage.getA_FACEBOK());

        ((JavascriptExecutor) socialPage.getDriver()).executeScript("arguments[0].removeAttribute('target');", link);
        link.click();
    }


    @Step
    public void FacebookValidate(){
        socialPage.getDriver().findElement(socialPage.getBTN_VERIFY_facebbok()).isDisplayed();
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    }

    @Step
    public void OpenSocialX(){
      WebElement link1 = socialPage.getDriver().findElement(socialPage.getA_X());
        ((JavascriptExecutor) socialPage.getDriver()).executeScript("arguments[0].removeAttribute('target');", link1);
        link1.click();

    }
    @Step
    public void XValidate(){

        socialPage.getDriver().findElement(socialPage.getBTN_VERIFY_X()).isDisplayed();
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

    }

    @Step
    public void OpenSocialLinkedin(){
       WebElement link2 = socialPage.getDriver().findElement(socialPage.getA_LINKEDING());
        ((JavascriptExecutor)socialPage.getDriver()).executeScript("arguments[0].removeAttribute('target');", link2);
        link2.click();
    }

    @Step
    public void LinkedinValidate(){
        socialPage.getDriver().findElement(socialPage.getMAIN_VERIFY()).isDisplayed();
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

    }
}
