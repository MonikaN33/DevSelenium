package runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@CucumberOptions(dryRun = !true,
features = {"src/test/java/feature/profile.feature"},
glue = {"stepDefinition"},
snippets = SnippetType.CAMELCASE,
monochrome = true

	)

public class runnerProfile extends AbstractTestNGCucumberTests
{

}
