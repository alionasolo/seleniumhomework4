package exercises.se.pages.RoofSpecification;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class RoofProducts {

    private WebDriver driver;

    @FindBy(xpath = "//h2[contains(text(), 'Tablă Cutată H12')] ")
    private WebElement productPageTitle;

    @FindBy(xpath = "//div[contains(@class,'specifications')] ")
    private WebElement specifications;

    @FindBy(xpath = "//div[contains(@class,'specifications-content')] ")
    private WebElement specificationsTable;

    public RoofProducts(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getSpecificationsTitles(){
        return specificationsTable.findElements(By.tagName("div"));
    }


    public WebElement getSpecificationsByName(String specificationName){
        return getSpecificationsTitles().stream()
                .filter(element -> element.findElement(By.tagName("span")).getText().equals(specificationName))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Such menu item does not exists - " + specificationName));
    }
}
