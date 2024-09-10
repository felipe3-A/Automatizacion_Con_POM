package co.com.aplication.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    By BTN_HAMBURGER= By.xpath("//button[@id='react-burger-menu-btn']");
    By A_LOGOUT = By.xpath("//a[@id='logout_sidebar_link']");
    By BTN_VERIFY = By.xpath("//input[@id='login-button']");

    public By getBTN_HAMBURGER() {
        return BTN_HAMBURGER;
    }

    public void setBTN_HAMBURGER(By BTN_HAMBURGER) {
        this.BTN_HAMBURGER = BTN_HAMBURGER;
    }

    public By getA_LOGOUT() {
        return A_LOGOUT;
    }

    public void setA_LOGOUT(By a_LOGOUT) {
        A_LOGOUT = a_LOGOUT;
    }

    public By getBTN_VERIFY() {
        return BTN_VERIFY;
    }

    public void setBTN_VERIFY(By BTN_VERIFY) {
        this.BTN_VERIFY = BTN_VERIFY;
    }
}
