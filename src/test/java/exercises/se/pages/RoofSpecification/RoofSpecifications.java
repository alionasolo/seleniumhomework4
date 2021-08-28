package exercises.se.pages.RoofSpecification;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
@Setter

public class RoofSpecifications {
    private WebDriver driver;

    @FindBy(xpath = "//div[contains(@class, 'burger-menu-block burger-animation')] ")
    private WebElement menu;


    @FindBy(xpath = "//div[contains(@class, 'nav-item border-block-gray')]//div[contains(@class,'items')]//a")
    private WebElement listOfCategories;

    @FindBy(xpath = "//a[contains(@class, 'product-item')][4]  ")
    private WebElement selectCategory;

    public List<WebElement> getMenuItems(){
        return listOfCategories.findElements(By.tagName("a"));
    }


    public WebElement getMenuItemByName(String menuItemName){
        return getMenuItems().stream()//punem in declarare list <WebElement> si nu plasam find element dar element-> element . equals...
                .filter(element -> element.findElement(By.tagName("a")).getText().equals(menuItemName))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Such menu item does not exists - " + menuItemName));
    }





   // @FindBy(xpath = "//div[contains(@class, 'category-page-item')][2] ")



    public RoofSpecifications(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
