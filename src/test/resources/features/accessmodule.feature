Feature: As a user, I should be able to see seveal modules once login

@smoke
	@EUG17-236
	Scenario: Librarian access to 3 modules
		Given the user navigates to login page
		When user login as a librarian
		And user access following  "Users" module
		And user access following  "Books" module
		And user access following  "Dashboard" module

