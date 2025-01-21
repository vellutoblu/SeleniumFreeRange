package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", //.feature files folder
    glue = "steps", //package containing classes where steps are defined
    plugin = {"pretty","html:target/cuucumber-reports"}
    )

public class TestRunner {
    
}
