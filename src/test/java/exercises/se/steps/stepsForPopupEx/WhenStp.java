package exercises.se.steps.stepsForPopupEx;

import cucumber.api.java.en.When;
import exercises.se.Actions.CommonActions;

import exercises.se.pages.Popup.FormPopup;
import exercises.se.pages.Popup.PopupMainPage;

import static exercises.se.browser.Driver.getDriver;

public class WhenStp {
    PopupMainPage popupMainPage = new PopupMainPage(getDriver());
    FormPopup formPopup = new FormPopup(getDriver());
    CommonActions actionsOnPopups = new CommonActions();





    @When("User clicks on {string} link from Form popup")

        public void scrollToElementSignin(String element){
        actionsOnPopups.scrollToElement(formPopup.getPopupTitle());
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
        formPopup.getPopupTitle();
        formPopup.accessSigninLink();
        }

        @When("User fills in the form")
    public  void fillIn (){
        formPopup.fillInTheForm("ali","ona");
    }
    @When("User clicks on {string} button")
    public void submitTheForm(String buttonName){
        formPopup.clickOnSubmitbutton();
    }
}
