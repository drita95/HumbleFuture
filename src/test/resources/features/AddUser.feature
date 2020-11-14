Feature: User management

	#*User Story:
	#As a librarian, I should be able to add users from users page.
	@EUG17-231 @EUG17-223
	#Acceptance Criteria:
	#4.1 add users with all valid info.
	#4.2. Librarians able to close the add user window with "close" button
	#4.3. Librarians able to edit user info.


	Scenario Outline: Add users with valid info
		Given User is logged in as Librarian
		When User clicks User Management Tab
		And User clicks to Add User button
		And Enter the following information

		|fullName  |<Full Name>|
		|password  |<Password>  |
		|email     |<Email> |
		|userGroup |<User Group> |
		|status    |<Status>     |
		|startDate |<Start Date>|
		|endDate   |<End Date>  |
		|address   |<Address>    |

		And User clicks Save Changes button
		Then The user has been created message should be displayed
		Examples:
		    |Full Name       |Password|Email                   |User Group|Status |Start Date |End Date  |Address                              |
		    |Ramsey student4 |abc12345|ramseystudent4@gmail.com|Students  |ACTIVE |2020-11-05 |2020-12-05|11th Avenue, No: 123, 01011, NewYork |
		    |Ramzy student5  |def67890|ramzystudent5@gmail.com |Students  |ACTIVE |2020-11-05 |2020-12-05|11th Avenue, No: 456, 01011, NewYork |
		    |Remy student6   |ghi19287|remystudent6@gmail.com  |Students  |ACTIVE |2020-11-05 |2020-12-05|11th Avenue, No: 789, 01011, NewYork |

		Scenario: Closing the add user window
		    Given User is logged in as Librarian
		    When User clicks User Management Tab
		    And User clicks to Add User button
		    And User clicks to Close button
		    Then User Management page should be displayed

	@wip
		Scenario: Editing user info
		    Given User is logged in as Librarian
		    When User clicks User Management Tab
		    And User click Edit User button
		    Then Edit User Information page should be opened
		    And User clicks Save Changes button
		    Then The user updated message should be displayed
		