package stepDefinition;



import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;  -- depreciated not supported
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
        (
            features="src/test/feature files",
            glue ="/Users/sammohite/IdeaProjects/inetBankingV1/src/test/java/stepDefinition",
            dryRun = false,
            //plugin={"pretty", "html:test-output"}
            plugin = {"pretty", "html:index1"}
        )
public class TestRunner {
}
