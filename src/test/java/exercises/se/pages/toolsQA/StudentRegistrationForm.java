package exercises.se.pages.toolsQA;

import exercises.se.browser.Driver;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Data
public class StudentRegistrationForm {
    private WebDriver driver;

    @FindBy(xpath = "//h5")
    private WebElement title;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstnameField;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastnameField;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement emailField;

//    @FindBy(xpath = "//div[contains(@class, 'col-md-3 col-sm-12')]")
//    private WebElement ;

    @FindBy(xpath = "//div[contains(text(), 'Gender')] ")
    private WebElement radiobutons;

    @FindBy(xpath = "//div[contains(@class, 'custom-control custom-radio custom-control-inline')]")
    private List<WebElement> genderRadiobutton;

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement userNumber;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    private WebElement dateOfBirthField;

    @FindBy(xpath = "//select[contains(@class, 'react-datepicker__month-select')]")
    private WebElement mounth;

    @FindBy(xpath = "//select[contains(@class, 'react-datepicker__year-select')]")
    private WebElement year;

    @FindBy(xpath = "//div[contains(@class, 'react-datepicker__mounth')]")
    private List<WebElement> listOfdate;


    @FindBy(xpath = "//input[contains(@id, 'subjectsInput')]")
    private WebElement subj;

    @FindBy(xpath = "//label[contains(@class, 'custom-control-label')]")
    private List<WebElement> hobbiesCheckbox;

    @FindBy(xpath = "//input[@id='uploadPicture'] ")
    private WebElement upload;

    @FindBy(xpath = "//textarea")
    private WebElement textareaAddress;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[contains(@class, 'al-body')]")
    private WebElement tableWithInsertedData;

    public StudentRegistrationForm(WebDriver webdriver) {
        this.driver = webdriver;
        PageFactory.initElements(webdriver, this);
    }

    public List<WebElement> getMenuItems(){
        return listOfdate;
    }


    public WebElement getMenuItemByName(String menuItemName){
        return getMenuItems().stream()//punem in declarare list <WebElement> si nu plasam find element dar element-> element . equals...
                .filter(element -> element.getText().equals(menuItemName))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Such menu item does not exists - " + menuItemName));
    }

    public WebElement getGenderRadiobutton(String radiobut) {
        return genderRadiobutton.stream().filter(element -> element.getText().equals(radiobut))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Such element does not exist " + radiobut));
    }

    public WebElement getHobbiesCheckbox(String checkbox) {
        return hobbiesCheckbox.stream().filter(element -> element.getText().equalsIgnoreCase(checkbox))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Such element does not exist " + checkbox));
    }


}
