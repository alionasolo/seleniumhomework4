package exercises.se.hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import exercises.se.browser.Driver;


public class BeforeAfterSteps {

    @Before
    public void beforeMethod(){
        Driver.runDriver();

    }

    @After
    public void afterMethod(){
        Driver.quitDriver();
    }
}
