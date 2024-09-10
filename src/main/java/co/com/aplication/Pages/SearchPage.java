package co.com.aplication.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {
    By SELECT_OPTION=By.xpath("//select[@class='product_sort_container']");
    By OPTION_1=By.xpath("//option[@value='hilo']");
    By VALIDATION_TITLE=By.xpath("//div[@id='inventory_container']");

    public By getVALIDATION_TITLE() {
        return VALIDATION_TITLE;
    }

    public void setVALIDATION_TITLE(By VALIDATION_TITLE) {
        this.VALIDATION_TITLE = VALIDATION_TITLE;
    }

    public By getSELECT_OPTION() {
        return SELECT_OPTION;
    }

    public void setSELECT_OPTION(By SELECT_OPTION) {
        this.SELECT_OPTION = SELECT_OPTION;
    }

    public By getOPTION_1() {
        return OPTION_1;
    }

    public void setOPTION_1(By OPTION_1) {
        this.OPTION_1 = OPTION_1;
    }
}
