package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(dryRun = !true,
features = {"src/test/java/feature/flightFinder.feature"},
glue = {"stepDefinition"},
snippets = SnippetType.CAMELCASE,
monochrome = true

	)


public class runnerFlightFinder extends AbstractTestNGCucumberTests
{

}
