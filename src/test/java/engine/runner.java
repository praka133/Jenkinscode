package engine;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/feature",
        glue = "stepDefinition",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class runner {
}
