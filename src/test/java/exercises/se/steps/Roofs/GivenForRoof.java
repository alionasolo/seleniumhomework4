package exercises.se.steps.Roofs;

import cucumber.api.java.en.Given;

import static exercises.se.browser.Driver.getDriver;

public class GivenForRoof {
    @Given("access the link {string}")
    public void accessLink(String linkName){

        getDriver().get(linkName);
    }
}
