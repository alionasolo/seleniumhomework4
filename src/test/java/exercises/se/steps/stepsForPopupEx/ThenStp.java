package exercises.se.steps.stepsForPopupEx;

import cucumber.api.java.en.Then;
import exercises.se.browser.Driver;

import exercises.se.pages.Popup.PopupMainPage;

public class ThenStp {
    PopupMainPage popupMainPage = new PopupMainPage(Driver.getDriver());
    @Then("User is redirected to main page")
    public void userIsOnMainPageAgain(){
        System.out.println(popupMainPage.getPopupPageTitle().trim());
    }
    @Then("The {string} button is deactivated")
    public void justAnObservation(String str){
        System.out.println("The "+str+" button is deactivated");
    }
}
