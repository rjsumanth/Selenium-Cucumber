package Runner2;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"StepDefinitions"})
public class RunnerFile
{

}