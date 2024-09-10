package co.com.aplication.Steps;

import co.com.aplication.Pages.AboutPage;
import net.thucydides.core.annotations.Step;

public class AboutSteps {
    AboutPage aboutPage;
    @Step
    public void goBotonHamburger() {
       aboutPage.getDriver().findElement(aboutPage.getBT_HAMBURGER()).click();
    }

    @Step
    public void goAabout() {
        aboutPage.getDriver().findElement(aboutPage.getA_ABOUT()).click();
    }

    @Step
    public void ValidationImage(){
        aboutPage.getDriver().findElement(aboutPage.getIMG_VALIDATION()).isDisplayed();
    }
}
