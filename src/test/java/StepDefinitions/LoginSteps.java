package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page");
	}

	@When("usr enters devarghya and devarghya")
	public void usr_enters_devarghya_and_devarghya() {
		System.out.println("usr enters devarghya and devarghya");
	}
	
	@When("usr enters test and test")
	public void usr_enters_test_and_test() {
		System.out.println("usr enters devarghya and devarghya");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page");
	}

}
