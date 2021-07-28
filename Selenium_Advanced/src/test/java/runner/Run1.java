package runner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="Feature",glue="stepDefn")
public class Run1  extends AbstractTestNGCucumberTests{

}
