package exercises.se.steps.StepsForSimpleForm;

import cucumber.api.java.en.Given;
import exercises.se.browser.Driver;


public class StepGiven {
    @Given("user is at {string} website")
    public void getTheLink(String strLink){
        Driver.getDriver().get(strLink);
    }
}
