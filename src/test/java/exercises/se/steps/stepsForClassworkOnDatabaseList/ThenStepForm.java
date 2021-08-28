package exercises.se.steps.stepsForClassworkOnDatabaseList;

import cucumber.api.java.en.Then;
import exercises.se.browser.Driver;

import exercises.se.pages.DemoFormUsingDataTable.DemoForm;

public class ThenStepForm {
    DemoForm demoForm = new DemoForm(Driver.getDriver());
    @Then("a message is displayed")
    public void displayeTheMessage(){
        System.out.println(demoForm.getSuccesMessage().getText());

    }
}
