

package com.headFirstJava.Exercise;

/**
 * @author Andres Ramirez
 * File: BeerSong.java
 * Description: The song's lyrics 99 bottles of beer on the wall: 
 * 				"99 bottles of beer. Take one down, pass it around, 
 * 				98 bottles of beer on the wall...No more bottles of beer on the wall"
 */

public class BeerSong {

	public static void main(String[] args) {
		int x = 99;
		
		while (x < 100 && x > 1) {
			System.out.print(x + " bottles of beer on the wall");
			System.out.println(". Take one down, pass it around,");
			x -=1;
		}
		
		if (x==1) {
			
			System.out.print(x + " bottle of beer on the wall");
			System.out.println(". Take one down, pass it around,");
			x -=1;
		}
		
		System.out.println("No more bottles of beer on the wall");
	}

}
