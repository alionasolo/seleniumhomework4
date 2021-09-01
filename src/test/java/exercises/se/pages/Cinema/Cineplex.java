package exercises.se.pages.Cinema;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
public class Cineplex {
    private WebDriver driver;

    @FindBy(xpath = "//div[contains(@class, 'nav-menu-bar')] ")
    private WebElement filMenu;
    @FindBy(xpath = "//ul[contains(@id, 'main-menu')]")
    private WebElement mainMenu;


    public Cineplex(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }

    public List<WebElement> getListElements(){
        return mainMenu.findElements(By.tagName("li"));
    }

    public WebElement getElementFromListByName(String elementName){
        return getListElements().stream()
                .filter(element -> element.findElement(By.tagName("a"))
                        .getText().equals(elementName))
                .findFirst()
                .orElseThrow(()-> new
                        RuntimeException("Such menu item does not exists - " + elementName));
    }


}
