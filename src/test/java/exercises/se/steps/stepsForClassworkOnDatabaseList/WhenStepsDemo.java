package exercises.se.steps.stepsForClassworkOnDatabaseList;

import cucumber.api.java.en.When;
import exercises.se.browser.Driver;
import io.cucumber.datatable.DataTable;

import exercises.se.pages.DemoFormUsingDataTable.DemoForm;

import java.util.List;

public class WhenStepsDemo {
    DemoForm demoForm = new DemoForm(Driver.getDriver());

    @When("user complete form with valid data")
    public void fillinTheForm(DataTable data){
        List<String> insertValueInTheField = data.asList();

        demoForm.getFirstField().sendKeys("Ali");
        demoForm.getSecondField().sendKeys("Ona");
        demoForm.getTextarea().sendKeys("Salut");

    }
    @When("user clicks on {string} buton")
    public void clickOnSubmitB(String buttonTitle){
        demoForm.getSubmitButtonDemoPage().click();
    }
}
