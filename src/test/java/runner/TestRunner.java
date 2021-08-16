package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features={"src/test/java/features/MyFeature.feature"},
					glue= {"stepDefination"})

public class TestRunner {

}
