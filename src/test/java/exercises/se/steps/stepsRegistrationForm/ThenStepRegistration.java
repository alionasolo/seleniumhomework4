package exercises.se.steps.stepsRegistrationForm;

import cucumber.api.java.en.Then;
import exercises.se.Actions.CommonActions;
import exercises.se.browser.Driver;
import exercises.se.pages.toolsQA.StudentRegistrationForm;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ThenStepRegistration {
    CommonActions commonActions = new CommonActions();
    StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm(Driver.getDriver());
    @Then("user clicks on {string} button at the bottom-right side of the page")
    public void userClickButton(String buttonName){
        commonActions.scrollToElement(studentRegistrationForm.getSubmitButton());
        studentRegistrationForm.getSubmitButton().click();
    }
    @Then("make a screenshot of the displayed popup")
    public void screenshotPopup() throws IOException {
        Screenshot screenshotPopup = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(Driver.getDriver());
        ImageIO.write(screenshotPopup.getImage(), "png", new File("C:\\Users\\eugen\\Downloads\\screenshots"));
    }
}
