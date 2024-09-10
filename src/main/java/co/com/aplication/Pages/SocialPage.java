package co.com.aplication.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SocialPage extends PageObject {
    By A_FACEBOK = By.xpath("//a[@data-test='social-facebook']");
    By BTN_VERIFY_facebbok = By.xpath("//div[@class='x1egiwwb x4l50q0']");

    By A_X = By.xpath("//a[@data-test='social-twitter']");
    By BTN_VERIFY_X = By.xpath("//button[@data-testid='30214566-follow']");

    By A_LINKEDING = By.xpath("//a[@data-test='social-linkedin']");
    By MAIN_VERIFY = By.xpath("//main[@id='main-content']");


    public By getBTN_VERIFY_facebbok() {
        return BTN_VERIFY_facebbok;
    }

    public void setBTN_VERIFY_facebbok(By BTN_VERIFY_facebbok) {
        this.BTN_VERIFY_facebbok = BTN_VERIFY_facebbok;
    }

    public By getBTN_VERIFY_X() {
        return BTN_VERIFY_X;
    }

    public void setBTN_VERIFY_X(By BTN_VERIFY_X) {
        this.BTN_VERIFY_X = BTN_VERIFY_X;
    }

    public By getMAIN_VERIFY() {
        return MAIN_VERIFY;
    }

    public void setMAIN_VERIFY(By MAIN_VERIFY) {
        this.MAIN_VERIFY = MAIN_VERIFY;
    }

    public By getA_FACEBOK() {
        return A_FACEBOK;
    }

    public void setA_FACEBOK(By a_FACEBOK) {
        A_FACEBOK = a_FACEBOK;
    }

    public By getA_X() {
        return A_X;
    }

    public void setA_X(By a_X) {
        A_X = a_X;
    }

    public By getA_LINKEDING() {
        return A_LINKEDING;
    }

    public void setA_LINKEDING(By a_LINKEDING) {
        A_LINKEDING = a_LINKEDING;
    }
}
