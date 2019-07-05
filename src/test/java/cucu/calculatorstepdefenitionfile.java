package cucu;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calculatorstepdefenitionfile {
	@Given("I enter 100 in the calculctor")
	public void I_enter_100_in_the_calculctor() {
		System.out.println("I enter 100 in the calculctor");
	}
	@And("I press add")
	public void I_press_add() {
		System.out.println("I press add");	
	}
	@And("I have entered 100 in the calculator")
	public void I_have_entered_100_in_the_calculator() {
		System.out.println("I_have_entered_100_in_the _calculator");
	}
	@When("I press equal symbol")
	public void I_press_equal_symbol() {
		System.out.println("I press equal symbol");
	}
    @Then("The result should be 200 on the screen")
    public void The_result_should_be_200_on_the_screen() {
    	System.out.println("The result should be 200 on the screen");
    }
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


