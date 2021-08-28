package exercises.se.steps.StepsForAutomationPracticeScreenshot;

import cucumber.api.java.en.When;
import exercises.se.browser.Driver;
import exercises.se.scenarioContext.ScenarioScreenshot;
import exercises.se.scenarioContext.ScenariooContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static exercises.se.browser.Driver.getDriver;
import static exercises.se.scenarioContext.ScenariooContext.getScenariooContext;

public class WhenAutomationScreenshots {

        private ScenariooContext scenarioContext = getScenariooContext();
        @When("there is taken a screenshot of the main page without an element")
        public void makeAScreenshotOfElement() throws IOException {
             new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                    .takeScreenshot(getDriver());

            Screenshot myScreenshot = new AShot().addIgnoredElement(By.xpath("//div[contains(@id,'slider_row')] "))
                    .takeScreenshot(Driver.getDriver());


//            WebElement elem =  getDriver().findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
//            Screenshot logoScreen = new AShot().takeScreenshot(getDriver(),
//                    elem);
//            ImageIO.write(logoScreen.getImage(),"png", new File("C:\\Users\\dbodac\\Downloads\\screenshots\\logoimage.png"));
//            scenarioContext.saveData(ScenarioScreenshot.SCREENSHOT1,logoScreen);
//        }

//        @When("there is takend screenshot with custom crop and blur")
//        public void makeAScreenshotWithEdit() throws IOException {
//            Screenshot croppedScreen = new AShot().imageCropper(new IndentCropper().addIndentFilter(
//                    new BlurFilter())).takeScreenshot(
//                    Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")));
//            ImageIO.write(croppedScreen.getImage(),"png", new File("C:\\Users\\dbodac\\Downloads\\screenshots\\logoimageCropped.png"));
//
//            scenarioContext.saveData(ScenarioScreenshot.SCREENSHOT_TO_COMPARE_2,croppedScreen);
//        }
//        @Then("there is compared 2 images")
//        public void compareTwoImages() throws IOException {
//            Screenshot s1 = (Screenshot) scenarioContext.getData(ScenarioKeys.SCREENSHOT_TO_COMPARE_1);
//            Screenshot s2 = (Screenshot) scenarioContext.getData(ScenarioKeys.SCREENSHOT_TO_COMPARE_2);
//            BufferedImage i1 =ImageIO.read(new File("C:\\Users\\dbodac\\Downloads\\screenshots\\logoimage.png"));
//            BufferedImage i2 = ImageIO.read(new File("C:\\Users\\dbodac\\Downloads\\screenshots\\logoImage_1.png"));
//            ImageDiff diff = new ImageDiffer().makeDiff(s1,s2);
//            BufferedImage bufImg = diff.getMarkedImage();
//            ImageIO.write(bufImg,"png", new File("C:\\Users\\dbodac\\Downloads\\screenshots\\comparedImage.png"));
//
//        }
    }
}
