package co.com.aplication.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AboutPage extends PageObject {

    By BT_HAMBURGER= By.xpath("//button[@id='react-burger-menu-btn']");
    By A_ABOUT = By.xpath("//a[@id='logout_sidebar_link']");
    By IMG_VALIDATION = By.xpath("(//img[@alt='Saucelabs'])[1]");

    public By getBT_HAMBURGER() {
        return BT_HAMBURGER;
    }

    public void setBT_HAMBURGER(By BT_HAMBURGER) {
        this.BT_HAMBURGER = BT_HAMBURGER;
    }

    public By getA_ABOUT() {
        return A_ABOUT;
    }

    public void setA_ABOUT(By a_ABOUT) {
        A_ABOUT = a_ABOUT;
    }

    public By getIMG_VALIDATION() {
        return IMG_VALIDATION;
    }

    public void setIMG_VALIDATION(By IMG_VALIDATION) {
        this.IMG_VALIDATION = IMG_VALIDATION;
    }
}
