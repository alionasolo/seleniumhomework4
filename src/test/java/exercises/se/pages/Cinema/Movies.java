package exercises.se.pages.Cinema;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;
@Getter
public class Movies {
    private WebDriver driver;
    @FindBy(xpath = "//div[contains(@id, 'block_now')] ")
    private WebElement filmsList;
    @FindBy(xpath = "//div[contains(@data-href,'https://cineplex.md/film/248-elibereaza-l-pe-guy-ru')]")
    private WebElement film;
    @FindBy(xpath = "//h3[contains(@class, 'film_title')] ")
    private WebElement movieTitle;
    @FindBy(xpath = "//div[contains(@class, 'fims_cast_all')]")
    private WebElement textDescription;
    @FindBy(xpath = "//ul[contains(@class, 'film_movies_info')]")
    private List<WebElement> tabledDescription;


    public Movies(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }

    public List<WebElement> getFilmList(){
        return filmsList.findElements(By.xpath( "//div[contains(@id, 'block_now')] "));
    }

    public WebElement getElementFromListByName(String elementName){
        return getFilmList().stream()
                .filter(element -> element.findElement(By.xpath(
                        "//div[contains(@data-href,'https://cineplex.md/film/248-elibereaza-l-pe-guy-ru')]")).getText()
                        .equalsIgnoreCase(elementName))
                .findFirst()
                .orElseThrow(()-> new
                        RuntimeException("Such menu item does not exists - " + elementName));
    }
    public String  getMovieTitle(String strName){
        return  strName;
    }
    public String  getDescriptionsByName(String description){
        WebElement  info = tabledDescription.stream().
                filter(element->element.findElement(By.tagName("li")).getText().equalsIgnoreCase(description))
                        .findFirst()
                .orElseThrow(()-> new
                RuntimeException("Such menu item does not exists - " + description));
        return info.findElement(By.className("film-movies-info-item")).getText();

    }
}
