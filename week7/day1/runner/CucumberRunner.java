package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;







@CucumberOptions(features = "src/main/java/features",
                       glue="stepdefnition",
                       monochrome=true,
                       publish=true,
                     //  tags="@Sanity"//to run only sanity testcase
                   //    tags="@smoke or @sanity"//scenarios having either @smoke or  @sanity are eligible
		              //   tags="@smoke and @functional"//scenarios having both @smoke and  @functional are excute
		             // tags=" not @smoke"
                       tags="@login"
		)
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
	
}