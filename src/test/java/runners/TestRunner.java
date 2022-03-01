package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = {"stepDefinition"},
		dryRun = true,
		monochrome = true,
		publish = true,
		plugin = {"pretty","json:target/json-report/cucumber.json","html:target/htmlreport/Report.html"},
		tags = "@P1 or @P2"
		)
public class TestRunner {

}
