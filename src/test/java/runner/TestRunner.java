package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "featureFiles",
		glue = "stepDefinition",
		plugin = {"pretty", "summary"},
		snippets = SnippetType.CAMELCASE,
		dryRun=false,
		tags="@DDT"


)
public class TestRunner {

}
