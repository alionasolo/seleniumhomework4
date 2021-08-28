package exercises.se.pages.SimpleFormPage;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class CompleteTheFields {

    private WebDriver driver;

    @FindBy(xpath = "//h1")
   private  WebElement pageTitle;

    @FindBy(xpath = "//h2[contains(text(),'Form')]")
    private WebElement formTitle;

    @FindBy(xpath = "//input[contains(@name,'firstName')]")
   private  WebElement firstNameField;

    @FindBy(xpath = "//input[contains(@name,'lastName')]")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[contains(@name,'email')]")
    private WebElement emailField;

    @FindBy(xpath = "//label[contains(text(),'Sex')]")
    private WebElement chooseGender;

    @FindBy(xpath = "//label[1]//input[contains(@value,'male')] ")
    private WebElement maleGender;

    @FindBy(xpath = "//label[2]//input[contains(@value,'female')] ")
    private WebElement femaleGender;

    @FindBy(xpath = "//select[contains(@name,'favoriteColor')]")
    private WebElement favColor;

    @FindBy(xpath = "//input[contains(@name,'employed')]")
   private WebElement checkbox;

    @FindBy(xpath = "//textarea")
    private WebElement notes;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    private WebElement submitTheform;

    public CompleteTheFields(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,CompleteTheFields.this);
    }

//    public WebDriver getDriver() {
//        return driver;
//    }
//
//    public WebElement getPageTitle() {
//        return pageTitle;
//    }
//
//    public WebElement getFormTitle() {
//        return formTitle;
//    }
//
//    public WebElement getFirstNameField() {
//        return firstNameField;
//    }
//
//    public WebElement getLastNameField() {
//        return lastNameField;
//    }
//
//    public WebElement getEmailField() {
//        return emailField;
//    }
//
//    public WebElement getChooseGender() {
//        return chooseGender;
//    }
//
//    public WebElement getFavColor() {
//        return favColor;
//    }
//
//    public WebElement getCheckbox() {
//        return checkbox;
//    }
//
//    public WebElement getNotes() {
//        return notes;
//    }
//
//    public WebElement getSubmitTheform() {
//        return submitTheform;
//    }
//
//    public WebElement getMaleGender() {
//        return maleGender;
//    }
//
//    public WebElement getFemaleGender() {
//        return femaleGender;
//    }
}
