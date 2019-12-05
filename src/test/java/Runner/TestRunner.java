package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"},
        features="src/test/Resources/Escenarios",
        glue={"StepDefinitions"}
)

public class TestRunner {}
