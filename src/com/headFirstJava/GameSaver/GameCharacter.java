package com.headFirstJava.GameSaver;

import java.io.Serializable;

/**
 * @author andresr
 *
 */
public class GameCharacter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int power;
	String type;
	String [] weapons;
	
	public GameCharacter( int p, String t, String[] w) {
		power = p;
		type = t;
		weapons = w;
	}

	public int getPower() {
		return power;
	}

	public String getType() {
		return type;
	}

	public String getWeapons() {
		String weaponList = "";
		
		for (int i = 0; i < weapons.length; i++) {
			weaponList += weapons[i] + "";
		}
		return weaponList;
	}

	
}
