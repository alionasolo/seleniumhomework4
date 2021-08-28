package exercises.se.pages.DemoFormUsingDataTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DemoForm {
    private WebDriver driver;

    @FindBy(xpath = "//h1")
    private WebElement title;

    @FindBy(xpath = "//input[contains(@name, 'name')]")
    private WebElement firstField;

    @FindBy(xpath = "//input[contains(@name, 'email')] ")
    private WebElement secondField;

    @FindBy(xpath = "//textarea[contains(@name,'message')] ")
    private WebElement textarea;

    @FindBy(xpath = "//button")
    private WebElement SubmitButtonDemoPage;

    @FindBy(xpath = "//h1")
    private WebElement succesMessage;

    public DemoForm(WebDriver driverDemo){
        this.driver = driverDemo;
        PageFactory.initElements(driverDemo,this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getFirstField() {
        return firstField;
    }

    public WebElement getSecondField() {
        return secondField;
    }

    public WebElement getTextarea() {
        return textarea;
    }

    public WebElement getSubmitButtonDemoPage() {
        return SubmitButtonDemoPage;
    }

    public WebElement getSuccesMessage() {
        return succesMessage;
    }
}
