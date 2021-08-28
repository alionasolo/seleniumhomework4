package exercises.se.steps.stepsForClassworkOnDatabaseList;

import cucumber.api.java.en.Given;


import static exercises.se.browser.Driver.getDriver;

public class GivenStepsDemo {
        @Given("user is at {string} page")
        public void displayDemoPage(String pageNameDemo){
            getDriver().get(pageNameDemo);
        }

    }

