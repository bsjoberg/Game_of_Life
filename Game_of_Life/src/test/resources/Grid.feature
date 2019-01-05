Feature: Simple grid for game of life
	Scenario: 3 by 3 grid with one alive cell in center dies after first tick
		Given 3 by 3 grid with 1 alive cell
		When game ticks 
		Then all cells are dead