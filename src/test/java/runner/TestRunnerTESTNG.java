package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(	features={"src/test/java/features/MyFeature.feature"},
					glue= {"stepDefination"})

public class TestRunnerTESTNG extends AbstractTestNGCucumberTests {

}
