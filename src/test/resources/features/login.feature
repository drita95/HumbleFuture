Feature: As a user, I should be able to login to the library app.
	#
	#Acceptance Criteria: 
	#AC: 1. verify both Students and librarians login
	@EUG17-225
	Scenario: Student logs in 
		Given the user navigates to login page 
		When the user enters "username" and "password"
		And the user clicks signin button 
		Then the page title should be "http://library2.cybertekschool.com/#books"
		