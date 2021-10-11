package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions

	(
			features="C:\\Users\\ram\\eclipse-workspace\\Vicroads\\Features\\GetVehiclePermit.feature",
			glue="setpDefinitions",
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:test-output"}
			
	)
			
	public class RunTest {			
		
}
