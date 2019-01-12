package fun;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GridSteps {
	private List<List<String>> board;
	
	@Given("^a board like this:$")
	public void aBoardLikeThis(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)

		this.board = table.raw();
	}

	@When("^game ticks$")
	public void gameTicks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(board.toString());
		
	    throw new PendingException();
	}
	
	@Then("^the board should look like this:$")
	public void theBoardShouldLookLikeThis(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)

		//Assert.assertTrue(table.raw().equals(board));
		throw new PendingException();
	}

}
