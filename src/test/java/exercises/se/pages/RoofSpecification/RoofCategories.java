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
public class RoofCategories {
    private WebDriver driver;
    @FindBy(xpath = "//h2[contains(@class, 'main-title full')] ")
    private WebElement categoryTitle;
    String s;

    @FindBy(xpath = "//div[contains(@class, 'category-page-wrapper')] ")
    private WebElement categoryList;

    @FindBy(xpath = "//a[contains(@href,'ro/products/tabla-cutata-h12')] ")
    private WebElement lookButton;

    public RoofCategories(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getMenuCategories(){
        return categoryList.findElements(By.tagName("div"));
    }


    public WebElement getMenuProductByName(String productName){
        return getMenuCategories().stream()
                .filter(element -> element.findElement(By.tagName("div")).getText().equals(productName))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Such menu item does not exists - " + productName));
    }


}
