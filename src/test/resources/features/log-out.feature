Feature: log-out

	#As a user, I should be able to logout from the library app
	@EUG17-227
	Scenario: User logs-out from libraryCT
		Given  User is on the home page
		When the user clicks on the username dropdown
		And the user clicks on log out option 
		Then user is on the login page
		