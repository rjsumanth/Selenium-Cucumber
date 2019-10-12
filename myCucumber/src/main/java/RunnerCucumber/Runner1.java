package RunnerCucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="MyFeatureFile",glue= {"CucSteps"})
public class MyntraRunner {

}
