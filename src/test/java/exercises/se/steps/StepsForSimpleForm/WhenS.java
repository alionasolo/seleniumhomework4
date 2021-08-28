package exercises.se.steps.StepsForSimpleForm;

import cucumber.api.java.en.When;
import exercises.se.browser.Driver;
import io.cucumber.datatable.DataTable;

import org.openqa.selenium.support.ui.Select;
import exercises.se.pages.SimpleFormPage.CompleteTheFields;

import java.util.List;

public class WhenS {
    CompleteTheFields completeTheFields = new CompleteTheFields(Driver.getDriver());
    @When("user complete the form with valid data")
    public void fillInTheFields(DataTable validData){
        List<String> insertedValue = validData.asList();
        completeTheFields.getFirstNameField().sendKeys(insertedValue.get(0));
        completeTheFields.getLastNameField().sendKeys(insertedValue.get(1));
        completeTheFields.getEmailField().sendKeys(insertedValue.get(2));
        completeTheFields.getChooseGender().getText().trim();
        completeTheFields.getFemaleGender().click();

        Select choose = new Select(completeTheFields.getFavColor());
        choose.selectByVisibleText(insertedValue.get(3));

        for(int i = 0 ; i<2;i++){
        completeTheFields.getCheckbox().click();
        System.out.println(completeTheFields.getCheckbox().isSelected());
}
        completeTheFields.getNotes().sendKeys(insertedValue.get(4));

    }
    @When("user clicks on {string} button")
    public void sendData(String buttonType){
        completeTheFields.getSubmitTheform().click();

    }
}
