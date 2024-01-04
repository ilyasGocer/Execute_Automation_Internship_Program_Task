package com.execute_automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html"

        },
        features = "features",
        glue = "com/execute_automation/step_definitions",
        dryRun = true,
        tags = ""
)
public class CukesRunner {
}
