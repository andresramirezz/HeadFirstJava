/**
 * 
 */
package com.headFirstJava.SinkaDotCom;

/**
 * @author Andres Ramirez
 * File: SimpleDotComTestDrive.java
 * Problem: Let's build a Battleship-style game "Sink a Dot Com"
 * Goal: Sink all of the computer's Dot Coms in the fewest number of guesses.
 */
public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);
		int [] locations = {randomNum, randomNum + 1,randomNum + 2 };
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while ( isAlive == true ) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if ( result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
		
			

	}

}
