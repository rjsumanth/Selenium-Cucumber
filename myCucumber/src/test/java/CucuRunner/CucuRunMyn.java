package CucuRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="MyFeatureFiles",glue = "CucumSteps",
format = {"pretty","html:target/myTestResult","json:json_folder/json1.json"},monochrome=true,strict = true, dryRun = false
  )
public class CucuRunMyn 
{
  
}
