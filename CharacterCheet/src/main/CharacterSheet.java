package main;

import java.util.HashMap;

/*
 * This class provides a basis for all data regarding any character
 * contains all skills, buffs, values in easily-understandable form
 * 
 * It is attached to all players, npcs, custom mobs
 */
public class CharacterSheet {
	int x = 6;
	public CharacterSheet(int y) {
		x = y;
	}

	//testing push

	public static void main(String[] args) {
		CharacterSheet c = new CharacterSheet(5);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
	}
	// UUAUAAAAAA
}	
