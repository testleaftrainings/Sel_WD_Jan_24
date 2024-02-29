package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(features = "src/test/java/features/Login1.feature",
                       glue="stepdefnition",
                       monochrome=true,
                       publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
	
}