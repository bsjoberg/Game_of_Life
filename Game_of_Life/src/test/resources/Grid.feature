Feature: Simple grid for game of life
	Scenario: 3 by 3 grid with one alive cell in center dies after first tick
		Given a board like this:
		| |1|2|3|
		|1|d|d|d|
		|2|d|a|d|
		|3|d|d|d|
		When game ticks 
		Then the board should look like this:
		| |1|2|3|
		|1|d|d|d|
		|2|d|d|d|
		|3|d|d|d|