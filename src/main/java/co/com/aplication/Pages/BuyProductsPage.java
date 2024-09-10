package co.com.aplication.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyProductsPage extends PageObject {
    By BTN_PRODUCT_1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By BTN_PRODUCT_2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    By A_CAR_SHOP = By.xpath("//a[@class='shopping_cart_link']");
    By USER_LOGIN = By.xpath("//input[@id='user-name']");
    By PASSWORD_LOGIN = By.xpath("//input[@id='password']");
    By BUTTON_LOGIN = By.xpath("//input[@id='login-button']");

    By TEXT_VERIFY_BUY = By.xpath("//button[@id='checkout']");

    By TEXT_NAME = By.xpath("//input[@id='first-name']");
    By TEXT_LAST_NAME = By.xpath("//input[@id='last-name']");
    By TEXT_ZIP_CODE = By.xpath("//input[@id='postal-code']");
    By BTN_CONTINUE = By.xpath("//input[@id='continue']");
    By BTN_FINISH = By.xpath("//button[@id='finish']");

    By IMG_VALIDATION = By.xpath("//img[@class='pony_express']");

    By BTN_DELETE1 = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    By BTN_DELETE2 = By.xpath("//button[@id='remove-sauce-labs-bike-light']");

    By IMG_PRODUCT =By.xpath("//img[@alt='Sauce Labs Backpack']");
    By ADD_PRODUCT = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");

    By MESSAGE_ERROR = By.xpath("//div[@class='error-message-container error']");

    public By getMESSAGE_ERROR() {
        return MESSAGE_ERROR;
    }

    public void setMESSAGE_ERROR(By MESSAGE_ERROR) {
        this.MESSAGE_ERROR = MESSAGE_ERROR;
    }

    public By getIMG_PRODUCT() {
        return IMG_PRODUCT;
    }

    public void setIMG_PRODUCT(By IMG_PRODUCT) {
        this.IMG_PRODUCT = IMG_PRODUCT;
    }

    public By getADD_PRODUCT() {
        return ADD_PRODUCT;
    }

    public void setADD_PRODUCT(By ADD_PRODUCT) {
        this.ADD_PRODUCT = ADD_PRODUCT;
    }

    public By getBTN_DELETE1() {
        return BTN_DELETE1;
    }

    public void setBTN_DELETE1(By BTN_DELETE1) {
        this.BTN_DELETE1 = BTN_DELETE1;
    }

    public By getBTN_DELETE2() {
        return BTN_DELETE2;
    }

    public void setBTN_DELETE2(By BTN_DELETE2) {
        this.BTN_DELETE2 = BTN_DELETE2;
    }

    public By getIMG_VALIDATION() {
        return IMG_VALIDATION;
    }

    public void setIMG_VALIDATION(By IMG_VALIDATION) {
        this.IMG_VALIDATION = IMG_VALIDATION;
    }

    public By getBTN_FINISH() {
        return BTN_FINISH;
    }

    public void setBTN_FINISH(By BTN_FINISH) {
        this.BTN_FINISH = BTN_FINISH;
    }

    public By getTEXT_NAME() {
        return TEXT_NAME;
    }

    public void setTEXT_NAME(By TEXT_NAME) {
        this.TEXT_NAME = TEXT_NAME;
    }

    public By getTEXT_LAST_NAME() {
        return TEXT_LAST_NAME;
    }

    public void setTEXT_LAST_NAME(By TEXT_LAST_NAME) {
        this.TEXT_LAST_NAME = TEXT_LAST_NAME;
    }

    public By getTEXT_ZIP_CODE() {
        return TEXT_ZIP_CODE;
    }

    public void setTEXT_ZIP_CODE(By TEXT_ZIP_CODE) {
        this.TEXT_ZIP_CODE = TEXT_ZIP_CODE;
    }

    public By getBTN_CONTINUE() {
        return BTN_CONTINUE;
    }

    public void setBTN_CONTINUE(By BTN_CONTINUE) {
        this.BTN_CONTINUE = BTN_CONTINUE;
    }

    public By getTEXT_VERIFY_BUY() {
        return TEXT_VERIFY_BUY;
    }

    public void setTEXT_VERIFY_BUY(By TEXT_VERIFY_BUY) {
        this.TEXT_VERIFY_BUY = TEXT_VERIFY_BUY;
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

    public By getBTN_PRODUCT_1() {
        return BTN_PRODUCT_1;
    }

    public void setBTN_PRODUCT_1(By BTN_PRODUCT_1) {
        this.BTN_PRODUCT_1 = BTN_PRODUCT_1;
    }

    public By getBTN_PRODUCT_2() {
        return BTN_PRODUCT_2;
    }

    public void setBTN_PRODUCT_2(By BTN_PRODUCT_2) {
        this.BTN_PRODUCT_2 = BTN_PRODUCT_2;
    }

    public By getA_CAR_SHOP() {
        return A_CAR_SHOP;
    }

    public void setA_CAR_SHOP(By a_CAR_SHOP) {
        A_CAR_SHOP = a_CAR_SHOP;
    }
}
