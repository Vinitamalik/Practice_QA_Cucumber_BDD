package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/",
       // tags= "@TokenGeneration or @Logger_Functionality or Test_4_Functionality",
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:target/reports", "json:target/reports/cucumber.json"},
        monochrome = true,
        strict = true
)
public class TestRunner {
}
