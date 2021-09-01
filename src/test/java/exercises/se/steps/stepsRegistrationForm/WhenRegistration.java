package exercises.se.steps.stepsRegistrationForm;

import cucumber.api.java.en.When;
import exercises.se.Actions.CommonActions;
import exercises.se.browser.Driver;
import exercises.se.pages.toolsQA.StudentRegistrationForm;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class WhenRegistration {
    CommonActions commonActions = new CommonActions();
    StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm(Driver.getDriver());
    @When("user complete the registration form with valid data")
    public void userCompleteForm(DataTable tableWithData){
        List<String>  values = tableWithData.asList();

        studentRegistrationForm.getFirstnameField().sendKeys(values.get(0));
        studentRegistrationForm.getLastnameField().sendKeys(values.get(1));
        studentRegistrationForm.getEmailField().sendKeys(values.get(2));
        studentRegistrationForm.getGenderRadiobutton(values.get(3)).click();
        studentRegistrationForm.getUserNumber().sendKeys(values.get(4));

        commonActions.moveToElement(studentRegistrationForm.getDateOfBirthField());
        studentRegistrationForm.getDateOfBirthField().click();

        Select selectMounth = new Select(studentRegistrationForm.getMounth());
        selectMounth.selectByIndex(11);

        Select selectYear = new Select(studentRegistrationForm.getYear());
        selectYear.selectByValue("1998");

//        Select selectDate = new Select(studentRegistrationForm.getListOfdate());
//        selectDate.selectByIndex(8);

        studentRegistrationForm.getSubj().sendKeys(values.get(5));
        studentRegistrationForm.getHobbiesCheckbox(values.get(5)).click();
        studentRegistrationForm.getUpload().sendKeys("C:\\Users\\eugen\\Downloads");




    }
}
