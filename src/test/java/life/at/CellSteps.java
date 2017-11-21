package life.at;

import static org.junit.Assert.assertFalse;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class CellSteps {
	
	private boolean cellIsDead; 
	private int numberOfLiveNeighbours; 
	
	@Given("a dead cell")
	public void givenADeadCell() {
	  this.cellIsDead = true; 
	}

/*	@Given("the cell has $liveCells live neighbours")
	public void givenTheCellHas3LiveNeighbours(int liveCells) {
	  this.numberOfLiveNeighbours = liveCells; 
	}*/

	@When("the cell evolves to the next generation")
	public void whenTheCellEvolvesToTheNextGeneration() {
	  this.cellIsDead = false; 
	}

	@Then("the cell is now alive")
	public void thenTheCellIsNowAlive() {
		assertFalse(this.cellIsDead);
	}

	
}
