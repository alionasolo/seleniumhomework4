package exercises.se.pages.Popup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PopupMainPage {
    private WebDriver driver;

    @FindBy(xpath = "//h1")
    WebElement mainPage;



    public PopupMainPage(WebDriver driver2){
        this.driver = driver2;
        PageFactory.initElements(driver2,this);
    }


    public String getPopupPageTitle(){
        return mainPage.getText();
    }
}
