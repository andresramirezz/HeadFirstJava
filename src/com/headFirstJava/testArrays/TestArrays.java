/**
 * 
 */
package com.headFirstJava.testArrays;

/**
 * @author Andres Ramirez
 *
 */
public class TestArrays {

	public static void main(String[] args) {
		
		String [] islands = new String[4];
		islands [0] = "Bermuda";
		islands [1] = "Fiji";
		islands [2] = "Azores";
		islands [3] = "Cozumel";
		
		int [] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		int ref = 0;
		while ( ref < 4) {
			System.out.print("island = ");
			System.out.println(islands[index[ref]]);
			ref +=1;
		}
		
	}

}
