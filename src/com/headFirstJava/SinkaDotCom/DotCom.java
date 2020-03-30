/**
 * 
 */
package com.headFirstJava.SinkaDotCom;

import java.util.ArrayList;

/**
 * @author Andres Ramirez
 * File: DotCom.java
 * Problem: Let's build a Battleship-style game "Sink a Dot Com"
 * Goal: Sink all of the computer's Dot Coms in the fewest number of guesses.
 * SetUp: computers places 3 Dot Coms, randomly on the virtual 7x7 grid
 */
public class DotCom {
	private ArrayList <String> locationCells;
	private String name;
	
	public void setLocationCells (ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself ( String userInput) {
		String result = "miss";
			int index = locationCells.indexOf(userInput);
			if ( index >= 0 ) {
				locationCells.remove(index);
				
				if ( locationCells.isEmpty() ) {
					result = "kill";
					System.out.println("Ouch! You sunk " + name + " :(");
				}
				else {
					result = "hit";
				}
			}
			return result;
	}
}
