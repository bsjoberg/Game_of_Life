package fun;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CellSteps {
    private Cell cell;
	
	@Given("^a cell is alive$")
	public void aCellIsAlive() throws Throwable {
		cell = new Cell();
	    cell.setAlive(true);
	}

	@When("^only one neighbor is alive$")
	public void onlyOneNeighborIsAlive() throws Throwable {
	    cell.setNumberOfAliveNeighbors(1);
	    cell.tick();
	}

	@Then("^the cell dies$")
	public void theCellDies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertFalse(cell.isAlive());
	}

	
}
