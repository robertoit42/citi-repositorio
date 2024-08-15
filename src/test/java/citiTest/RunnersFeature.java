package citiTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features = { "src/test/resources/features" }, glue = {"citiDefinitions" })
	//@CucumberOptions(features = {"src/test/resources/features" }, glue = {"citiDefinitions" }, tags = {"@tag2"})
	
	public class RunnersFeature {
		
}
