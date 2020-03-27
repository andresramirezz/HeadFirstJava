/**
 * 
 */
package com.headFirstJava.SinkaDotCom;

/**
 * @author Andres Ramirez
 * File: SimpleDotCom
 * Problem: Let's build a Battleship-style game "Sink a Dot Com"
 * Goal: Sink all of the computer's Dot Coms in the fewest number of guesses.
 *
 */
public class SimpleDotCom {
	int [] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells ( int[] locs ) {
		locationCells = locs;
		System.out.println(locationCells[0]+" "+locationCells[1]+" "+locationCells[2]);
	}
	
	public String checkYourself ( String stringGuess ) {
		int guess = Integer.parseInt( stringGuess );
		String result = "miss";
		for (int cell : locationCells) {
			if ( guess == cell ) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if ( numOfHits == locationCells.length ) {
			result = "kill";
		}
		System.out.println( result );
		return result;
	}
}
