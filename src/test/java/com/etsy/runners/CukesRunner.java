package com.etsy.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"json:target/cucumber.json",
                "html:target/default-html-repots",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "src/test/java/com/etsy/step_definitions",
        dryRun = true,
        tags ="@wip"
)
public class CukesRunner {
}
