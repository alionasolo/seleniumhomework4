package exercises.se.runnerProjects;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"exercises.se.steps","exercises.se.configuration"},
        tags = ("@Run"),
        plugin = {"pretty", "html:target/cucumber-report"})

public class TestRunnerSelenium {


}
