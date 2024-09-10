package co.com.aplication.Steps;

import co.com.aplication.Pages.LoginPage;
import net.thucydides.core.annotations.Step;



public class LoginSteps {
  LoginPage loginPage;
    @Step
    public void OpenPage(){
      loginPage.open();
  }

/*Login Correct*/
  @Step
  public void enterUser(String user){
      loginPage.getDriver().findElement(loginPage.getUSER_LOGIN()).sendKeys(user);
       try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);
    }
  }

  @Step
  public void enterPassword(String password){
      loginPage.getDriver().findElement(loginPage.getPASSWORD_LOGIN()).sendKeys(password);
       try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);
    }
  }

  @Step
  public void clickLogin(){
      loginPage.getDriver().findElement(loginPage.getBUTTON_LOGIN()).click();
  }

  @Step
    public void verifyText(){
        loginPage.getDriver().findElement(loginPage.getTEXT_VERIFY()).isDisplayed();
  }
    /*Login Incorrect*/
  @Step
    public void verifyError(){
        loginPage.getDriver().findElement(loginPage.getTEXT_ERROR()).isDisplayed();
  }
    /*Login Incomplete Pass*/
    @Step
    public void IncompletePass(){
        loginPage.getDriver().findElement(loginPage.getTEXT_ERROR()).isDisplayed();

    }
}

