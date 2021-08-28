package exercises.se.pages.WineTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WineToursMainPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[contains(@class, 'menu-block')]")
    WebElement offersList;
    public WineToursMainPage(WebDriver driver3){
        this.driver = driver3;
        PageFactory.initElements(driver3,this);
    }

    public List<WebElement> getListElements(){
        return offersList.findElements(By.tagName("li"));
    }

    public WebElement getElementFromListByName(String elementName){

        return getListElements().stream()
                .filter(element -> element.findElement(By.tagName("a")).getText().equalsIgnoreCase(elementName))
                .findFirst()
                .orElseThrow(()-> new
                        RuntimeException("Such menu item does not exists - " + elementName));
    }
}
