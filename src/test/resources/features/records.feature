Feature: 

	#As a students, I should be able to see tables with default info
	@EUG17-233
	Scenario Outline: As a librarian, I should be able to see book records on user page
		Given user is on the login page
		And user logged in as a "Student"
		And default 10 records 
		And Show records for <count> options 
		   Examples:
		      | count |
		      | 5        |
		      | 10      |
		      | 15      |
		      | 50      |
		      | 100    |