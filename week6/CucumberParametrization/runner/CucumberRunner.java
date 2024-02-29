package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(features = "src/main/java/features",
                       glue="stepdefnition",
                       monochrome=true,
                       publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
	
}