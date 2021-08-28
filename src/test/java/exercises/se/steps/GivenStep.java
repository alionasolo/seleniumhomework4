//package exercises.se.steps;
//
//
//import io.cucumber.java.en.Given;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//
//import static exercises.se.browser.Driver.getDriver;
//
//public class GivenStep {
//    @Given("User is at heroku page")
//    public  void mainPage(){
//        getDriver().get("http://the-internet.herokuapp.com/");
//    }
//
//
//
//
//
//    @Given("User is on winery page")
//    public void WineWorthTheJourneyPage(){
//        getDriver().get("https://winetours.md/rom");
//        WebElement button = getDriver().findElement(By.xpath("//a[contains(@class, 'btn btn-medium btn-green')]"));
//        button.click();
//
//    }
//
//}
