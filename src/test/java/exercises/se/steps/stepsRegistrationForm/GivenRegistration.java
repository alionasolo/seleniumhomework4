package exercises.se.steps.stepsRegistrationForm;

import cucumber.api.java.en.Given;
import exercises.se.browser.Driver;



public class GivenRegistration {
    @Given("user access {string} page")
    public void userIsOnPage(String str){
        Driver.getDriver().get(str);
    }

}
