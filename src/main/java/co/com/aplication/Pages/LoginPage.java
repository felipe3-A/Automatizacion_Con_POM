package co.com.aplication.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    By USER_LOGIN = By.xpath("//input[@id='user-name']");
    By PASSWORD_LOGIN = By.xpath("//input[@id='password']");
    By BUTTON_LOGIN = By.xpath("//input[@id='login-button']");
    By TEXT_VERIFY = By.xpath("//div[@class='app_logo']");
    By TEXT_ERROR = By.xpath("//div[@class='error-message-container error']");




    public By getTEXT_VERIFY() {
        return TEXT_VERIFY;
    }

    public By getTEXT_ERROR() {
        return TEXT_ERROR;
    }

    public void setTEXT_ERROR(By TEXT_ERROR) {
        this.TEXT_ERROR = TEXT_ERROR;
    }

    public void setTEXT_VERIFY(By TEXT_VERIFY) {
        this.TEXT_VERIFY = TEXT_VERIFY;
    }


    public By getUSER_LOGIN() {
        return USER_LOGIN;
    }

    public void setUSER_LOGIN(By USER_LOGIN) {
        this.USER_LOGIN = USER_LOGIN;
    }

    public By getPASSWORD_LOGIN() {
        return PASSWORD_LOGIN;
    }

    public void setPASSWORD_LOGIN(By PASSWORD_LOGIN) {
        this.PASSWORD_LOGIN = PASSWORD_LOGIN;
    }

    public By getBUTTON_LOGIN() {
        return BUTTON_LOGIN;
    }

    public void setBUTTON_LOGIN(By BUTTON_LOGIN) {
        this.BUTTON_LOGIN = BUTTON_LOGIN;
    }










}