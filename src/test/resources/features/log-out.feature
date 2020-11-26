@smoke
Feature: log-out
	Background:
		Given the user navigates to login page


	#As a user, I should be able to logout from the library app
	@EUG17-227
	Scenario: User logs-out from libraryCT
		Given the user login as a "student"
		Given  User is on the home page
		When the user clicks on the username dropdown
		And the user clicks on log out option 
		Then user is on the login page
		