package exercises.se.steps.stepsForPopupEx;

import cucumber.api.java.en.Given;
import exercises.se.browser.Driver;


public class GivenStp {
    @Given("User is on main page")
    public void popup(){
        Driver.getDriver().get("https://demos.jquerymobile.com/1.4.5/popup/");
    }
}
