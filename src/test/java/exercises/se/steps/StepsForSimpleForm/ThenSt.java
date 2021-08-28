package exercises.se.steps.StepsForSimpleForm;

import cucumber.api.java.en.Then;
import exercises.se.Actions.CommonActions;

import org.openqa.selenium.Alert;

import java.util.concurrent.TimeUnit;

import static exercises.se.browser.Driver.getDriver;

public class ThenSt {

    CommonActions commonActions = new CommonActions();
    @Then("user accepts the conditions of the displayed alert")

    public void acceptAlert(){

getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Alert anAlert = getDriver().switchTo().alert();
        System.out.println(anAlert.getText().trim());
        anAlert.accept();
    }
}
