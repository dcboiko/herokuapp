import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    // tags = "@Test",
    plugin = {"summary","pretty"/*, "html:target/cucumber-reports.html" */},
    publish = true,
    monochrome = true
)

public class RunnerCucumber {

}