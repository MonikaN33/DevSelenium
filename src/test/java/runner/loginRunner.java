package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(dryRun = !true,
features = {"src/test/java/feature/login.feature"},
glue = {"stepDefinition"},
snippets = SnippetType.CAMELCASE,
monochrome = true

	)


public class loginRunner extends AbstractTestNGCucumberTests
{

}
