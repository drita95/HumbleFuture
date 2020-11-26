@smoke
Feature: login

	#User Stories:  # As a user, I should be able to login to the library app.
	#
	#Acceptance Criteria: 
	#AC: 1. verify both Students and librarians login
	@EUG17-225
	Scenario Outline: The User Logs in as <userType>
		Given the user navigates to login page 
		When the user  enters "<email>" and "<password>" as a "<userType>"
		And the user clicks signin button 
		Then the page title should be "Login - Library"
	Examples:
	|userType |email           |password|
	|Student  |student94@library   |KccVOoLA|
	|Student  |student95@library   |Vu2BiIwB|
	|Student  |student96@library   |HvGl6Nsy|
	|Librarian|librarian16@library |8BzUhhaU|
		