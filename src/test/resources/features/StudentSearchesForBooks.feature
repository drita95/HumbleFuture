Feature: Student searches for book categories

	#*User Stories:* 
	# # As a students, I should be able to search books with different categories.
	@EUG17-235
	Scenario Outline: Student searches for different book categories 
		Given a student loged in
		When the user clicks an "<option>" from Book Categories Dropdown
		Then the only selected Category of books should appear under results table
		Examples:
			| option                  |
			| Action and Adventure    |
			| Anthology               |
			| Classic                 |
			| Comic and Graphic Novel |
			| Crime and Detective     |
			| Drama                   |
			| Fable                   |
			| Fairy Tale              |
			| Fan-Fiction             |
			| Fantasy                 |
			| Historical Fiction      |
			| Horror                  |
			| Science Fiction         |
			| Biography/Autobiography |
			| Humor                   |
			| Romance                 |
			| Short Story             |
			| Essay                   |
			| Memoir                  |
			| Poetry                  |
		
		