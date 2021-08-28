package exercises.se.pages.WineTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MimiTour {
    WebDriver driver;
    @FindBy(xpath = "//a[3]")
    WebElement CastelMimi;

    public MimiTour(WebDriver driver3){
        this.driver = driver3;
        PageFactory.initElements(driver3,this);
    }
    public WebElement getPageTourName(){
        return CastelMimi;
    }
}
