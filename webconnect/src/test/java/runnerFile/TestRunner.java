package runnerFile;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featurefiles", glue = { "stepDefinition" }, plugin = { "pretty",
"json:target/cucumber.json" }, monochrome = true, tags = "@Login"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
