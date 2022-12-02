package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",
                 glue="stepDefination",
                 monochrome=true,
                 //dryRun=true
                 tags="@Loginwithmultiletestdata"
                 //tags="@All"
                 )

public class TestRunner {

}
