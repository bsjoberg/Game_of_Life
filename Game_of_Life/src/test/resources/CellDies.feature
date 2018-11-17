Feature: Any live cell with fewer than two live neighbors dies as if by under population
	Scenario: cell dies with only one neighbor
		Given a cell is alive 
		When only one neighbor is alive
		Then the cell dies
		