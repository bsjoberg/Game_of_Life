package fun;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GridSteps {
	@Given("^(\\d+) by (\\d+) grid with (\\d+) alive cell$")
	public void byGridWithAliveCell(int xSize, int ySize, int numberOfAliveCells) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Grid grid = new Grid(xSize, ySize);
	    
	    if (numberOfAliveCells == 1) {
	    	// Set top left of cell alive
	    }
	}

	@When("^game ticks$")
	public void gameTicks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^all cells are dead$")
	public void allCellsAreDead() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
