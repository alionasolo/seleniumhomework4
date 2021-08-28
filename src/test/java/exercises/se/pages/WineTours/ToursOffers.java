package exercises.se.pages.WineTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ToursOffers {
    WebDriver driver;
    @FindBy(tagName="a")
    WebElement tours;

    @FindBy(xpath = "//section")
    WebElement sections;

    @FindBy(tagName = "h1")
    private WebElement winaryExcursionHeader;

    public ToursOffers(WebDriver driver3){
        this.driver = driver3;
        PageFactory.initElements(driver3,this);
    }
    public WebElement getSectionName(){
        driver.manage().timeouts().implicitlyWait(10,SECONDS);
         return tours;
    }
    public List<WebElement> getListElements(){
        return tours.findElements(By.xpath("//a[contains(text(),'Excursii la vinării')]"));
    }

    public WebElement getElementFromListByName(String elementName){
        return getListElements().stream()
                .filter(element ->element.findElement(By.tagName("a")).getText().equalsIgnoreCase(elementName))
                .findFirst()
                .orElseThrow(()-> new
                        RuntimeException("Such menu item does not exists - " + elementName));
    }

}
