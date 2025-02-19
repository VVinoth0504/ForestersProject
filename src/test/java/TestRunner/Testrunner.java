package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\Foresters.feature",
                 glue = "Stepdefinition",
                 plugin = {"html:target/html", "json:target/report.json"},
                 monochrome = true,
                 dryRun = false,
                 strict = true)

public class Testrunner {
	
	

}
