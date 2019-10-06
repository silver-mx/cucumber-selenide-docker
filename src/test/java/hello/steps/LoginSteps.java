package hello.steps;

import static org.junit.jupiter.api.Assertions.fail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("a user with username user and password password")
	public void a_user_with_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		fail();
	}

	@When("the user logs in")
	public void the_user_logs_in() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("the hello page is shown")
	public void the_hello_page_is_shown() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
}
