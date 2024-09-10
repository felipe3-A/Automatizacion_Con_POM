package co.com.aplication.Steps;

import co.com.aplication.Pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {
    SearchPage searchPage;
    @Step
    public void SelectList(){
        searchPage.getDriver().findElement(searchPage.getSELECT_OPTION()).click();
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

    }

    @Step
    public void SelectOption(){
        searchPage.getDriver().findElement(searchPage.getOPTION_1()).click();
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

    }

    @Step
    public void ValidateSearch(){
        searchPage.getDriver().findElement(searchPage.getVALIDATION_TITLE()).isDisplayed();
    }

}
