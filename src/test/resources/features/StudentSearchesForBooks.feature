Feature: Student searches for book categories

	#*User Stories:* 
	# # As a students, I should be able to search books with different categories.
	@EUG17-235
	Scenario Outline: Student searches for different book categories 
		Given the student logs in using "<email>" and "<password>"
		When the user clicks an "option" from following category dropdown:
		|Action and Adventure|
		|Anthology|
		|Classic|
		|Comic and Graphic Novel|
		|Crime and Detective|
		|Drama|
		|Fable|
		|Fairy Table|
		|Fan-Fiction|
		|Fantasy|
		|Historical Fiction|
		|Horror|
		|Science Fiction|
		|Biography/Autobiography|
		|Humor|
		|Romance|
		|Short Story|
		|Essay|
		|Menoir|
		|Poetry|
		Then the only selected Category of books should appear under results table.
		Examples: 
		      |email               |password|
			  |student94@library   |KccVOoLA|
			  |student95@library   |Vu2BiIwB|
		      |student96@library   |HvGl6Nsy|
			  |librarian16@library |8BzUhhaU|
		
		