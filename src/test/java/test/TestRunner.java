package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"stepdefinitions"},
        format = {
                "json:target/cucumber/cucumber-automation-report.json",
                "html:target/cucumber/cucumber-html-report",
                "pretty"
        },
        tags = {"@tags"}
)
public class TestRunner {
}