package exercises.se.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements {
    private WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Exit Intent')]")
    private WebElement pageTitle;

    public CommonElements(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }
    public WebElement getPageTitle(){
        return pageTitle;
    }
}
