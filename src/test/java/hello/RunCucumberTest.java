package hello;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", strict = true, features = "src/test/resources/hello")
public class RunCucumberTest
{
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Worked");
	}

}
