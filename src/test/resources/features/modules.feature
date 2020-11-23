Feature: As a user, I should be able to see seveal modules once login.
@smoke
	#User story:
	#

	@EUG17-229
	Scenario Outline: The user see several modules once login.
		Given the user navigates to login page
		When user login as a student 
		Then user see <module>
		Examples:
		         |module|
		         | Books | 
		         | Borrowing Books|
		
		
		