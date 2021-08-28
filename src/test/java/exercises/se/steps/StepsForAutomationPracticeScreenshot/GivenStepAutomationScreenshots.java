package exercises.se.steps.StepsForAutomationPracticeScreenshot;

import cucumber.api.java.en.Given;

import static exercises.se.browser.Driver.getDriver;

public class GivenStepAutomationScreenshots {
    @Given("user is on {string} page")
    public void userIsOnMainPage(String strTitle){
        getDriver().get("http://automationpractice.com/index.php");
    }
}
