package exercises.se.data;


import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class DatatableClass {
    private  WebDriver driver;

    @FindBy(xpath = "//input[contains(@name, 'first_name')]")
    private WebElement firstNameInput;
    @FindBy(xpath = "//input[contains(@name, 'last_name')]")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[contains(@name, 'email')]")
    private WebElement emailInput;
    @FindBy(xpath = "//input[contains(@name, 'phone')]")
    private WebElement phoneInput;
    @FindBy(xpath = "//input[contains(@name, 'address')]")
    private WebElement addressinput;
    @FindBy(xpath = "//input[contains(@name, 'city')]")
    private WebElement cityInput;
    @FindBy(xpath = "//input[contains(@name, 'zip')]")
    private WebElement zipInput;
    @FindBy(xpath = "//input[contains(@name, 'website')]")
    private WebElement websiteInput;
    @FindBy(xpath = "//textarea")
    private WebElement textArea;
    @FindBy(xpath = "//select")
    private WebElement selectInput;
    @FindBy(xpath = "//button[contains(text(),'Send')]")
    private WebElement sendButton;


}
