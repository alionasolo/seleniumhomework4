package exercises.se.steps;

import cucumber.api.java.en.When;
import exercises.se.Actions.CommonActions;
import exercises.se.browser.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import exercises.se.pages.HerokuAppHomePage;
import exercises.se.pages.WineTours.ToursOffers;
import exercises.se.pages.WineTours.WineToursMainPage;

public class WhenStep {
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void moveToElement(WebElement element) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.perform();
    }

    public void waitUntilElementDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until((ExpectedCondition<Boolean>) arg -> element.isDisplayed());
    }
    HerokuAppHomePage herokuAppHomePage = new HerokuAppHomePage((Driver.getDriver()));
    CommonActions actions = new CommonActions();
    WineToursMainPage wineToursMainPage = new WineToursMainPage(Driver.getDriver());
    ToursOffers toursOffers = new ToursOffers(Driver.getDriver());
    @When("User clicks on {string} link")
    public void clickOnCertainLink(String namePage){


        actions.scrollToElement(herokuAppHomePage.getElementFromListByName(namePage));
        herokuAppHomePage.getElementFromListByName(namePage);

    }
    @When("User access {string} section")
    public void selectASection(String nameOfSection){

        waitUntilElementDisplayed(Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Excursii la vinării')]")));
        Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Excursii la vinării')]")).click();
        toursOffers.getElementFromListByName("Excursii la vinării").click();


        waitUntilElementDisplayed(Driver.getDriver().findElement(By.xpath("//h1[contains(text(),'Excursii la vinării')]")));
    }
    @When("User clicks on {string} item")
    public void chooseATour(String tourName){
        actions.scrollToElement(toursOffers.getElementFromListByName(tourName));
        toursOffers.getElementFromListByName(tourName);

    }
}
