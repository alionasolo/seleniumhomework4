package exercises.se.steps;

import cucumber.api.java.en.Then;
import exercises.se.browser.Driver;
import exercises.se.pages.CommonElements;
import exercises.se.pages.WineTours.MimiTour;

public class ThenStep {
    CommonElements commonElements = new CommonElements((Driver.getDriver()));
    MimiTour mimiTour = new MimiTour(Driver.getDriver());
    @Then("{string} is displayed")
    public void mainPageIsDisplayed(String name){
        System.out.println(commonElements.getPageTitle().getText());
    }
    @Then("The {string} page is displayed")
    public void mimiMainPageIsDisplayed(String cstleName){
        System.out.println(mimiTour.getPageTourName().getText());
    }
}
