package mytestrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\elipse-workspace\\CucumberPOMPractice\\src\\test\\resources\\com.features",
		glue = {"stepdefinitions", "appHooks"},
		plugin = "pretty",
		publish = true
		)

public class MyTestRunner {

}
