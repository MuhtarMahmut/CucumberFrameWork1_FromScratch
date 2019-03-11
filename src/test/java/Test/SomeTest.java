package Test;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
                    tags = "@google",
        glue = "Steps",
        dryRun = false,
        plugin = {"html:CucumberReports",
                "junit:CucumberReports/JunitReport.xml"
        }
)
public class SomeTest {


}
