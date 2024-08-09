import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    // tags = "@Test",
    plugin = {"pretty", "html:target/cucumber-reports", "summary"},
    monochrome = true
)

public class RunnerCucumber {

}