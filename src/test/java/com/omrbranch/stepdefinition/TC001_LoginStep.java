package com.omrbranch.stepdefinition;

import io.cucumber.java.en.*;

public class TC001_LoginStep {

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() {
	}
	
	@When("User enters {string} and {string}")
	public void userEntersAnd(String userName, String password) {
	}
	
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expFirstName) {
	}



	@When("User enters {string} and {string} with enter key")
	public void userEntersAndWithEnterKey(String userName, String password) {
	}


	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expErrorMessage) {
	}





}
