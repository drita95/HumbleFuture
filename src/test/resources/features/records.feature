Feature: 

	#As a students, I should be able to see tables with default info
	@EUG17-233
	Scenario: As a librarian, I should be able to see book records on user page
		Given the user navigates to login page
		And user login as a librarian
		Then click Books
		And default "10" records
		And records show following options
		      | 5        |
		      | 10      |
		      | 15      |
		      | 50      |
		      | 100    |


