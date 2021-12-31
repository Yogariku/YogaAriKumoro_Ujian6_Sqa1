Feature: Shop Demo QA Register

	Scenario: Testing registration page
		Given User go to the Website
		When User click My Account button
		And User create username email password and click Register
		Then User has created an account