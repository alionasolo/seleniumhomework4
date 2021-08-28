package exercises.se.pages.Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPopup {
    private WebDriver driver;

    @FindBy(xpath = "//h2[@id='Form']")
    WebElement form;
    @FindBy(xpath = "//a[contains(@href, '#popupLogin')]")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='un']")
    WebElement username;
    @FindBy(xpath = "//input[@id='pw']")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(), 'Sign in')]")
    WebElement submitButton;

    public FormPopup(WebDriver driver2){
        this.driver = driver2;
        PageFactory.initElements(driver2,FormPopup.this);
    }
    public WebElement getPopupTitle(){
        return form;
    }
    public void accessSigninLink(){
        signIn.click();
    }
    public  void fillInTheForm(String name,String pw){
        username.sendKeys(name);
        password.sendKeys(pw);
    }
    public void clickOnSubmitbutton(){
        submitButton.click();
    }

}
