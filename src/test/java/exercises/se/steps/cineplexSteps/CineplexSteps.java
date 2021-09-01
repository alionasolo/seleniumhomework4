package exercises.se.steps.cineplexSteps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exercises.se.Actions.CommonActions;
import exercises.se.browser.Driver;
import exercises.se.data.MovieDescriptionData;
import exercises.se.pages.Cinema.Cineplex;
import exercises.se.pages.Cinema.Movies;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.List;

import static exercises.se.browser.Driver.getDriver;

public class CineplexSteps {
    Cineplex cineplex = new Cineplex(Driver.getDriver());
    Movies movies = new Movies(Driver.getDriver());
    CommonActions commonActions = new CommonActions();
    @Given("user access {string} website on chrome")
    public void cineplexMainPage(String page){
        getDriver().get("https://www.cineplex.md/");
    }
    @Given("user select {string} category from the main menu")
    public void selectFilmsCategory(String categoryName){
        cineplex.getElementFromListByName(categoryName).click();
    }
    @When("user select a movie from the list")
    public void selectAMovie(String movieName){
        commonActions.scrollToElement(movies.getElementFromListByName(movieName));
        movies.getElementFromListByName(movieName).click();

    }
    @Then("next information is displayed")
    public void movieDescription(DataTable dataTable){
        System.out.println(movies.getMovieTitle().getText());
        List<MovieDescriptionData> movieInfo = dataTable.asList(MovieDescriptionData.class);

        for(MovieDescriptionData descriptionData : movieInfo){
            Assert.assertEquals("Information about movies is displayed",descriptionData.getInfoTitle(),
                    movies.getDescriptionsByName(descriptionData.getInfo()));
        }
        for(MovieDescriptionData descriptionData : movieInfo){
            System.out.println(descriptionData.getInfoTitle()+": "+
                    movies.getDescriptionsByName(descriptionData.getInfo()));
        }



    }
}
