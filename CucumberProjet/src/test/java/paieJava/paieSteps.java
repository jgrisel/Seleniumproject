package paieJava;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paieSteps {
	@Given("a list of employees salary")
	public void a_list_of_employees_salary() {
	 
	}

	@When("it is a bob")
	public void it_is_a_bob() {
	   
	}

	@Then("the salary should be ^(\\d+)k?$")
	public void the_salary_should_be_35k(int expected) {

	}

	@When("it is a bill")
	public void it_is_a_bill() {

	}

	@Then("the salary should be 50k?")
	public void the_salary_should_be_50k() {

	}

}