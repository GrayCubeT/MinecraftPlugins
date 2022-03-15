package main;

import java.util.HashMap;

/**
 * This class provides a basis for all data regarding any character
 * contains all skills, buffs, values in easily-understandable form<br>
 * <br>
 * It is attached to all players, npcs, custom mobs<br>
 * <br>
 * must be saved to database every now and then in case server crashes<br>
 * needs to be saved on player exits and fetched on player joins<br>
 * <br>
 * Since this is constantly used by server on almost every event, it must 
 * be kept loaded in RAM
 */
public class CharacterSheet {
	int x = 6;
	public CharacterSheet(int y) {
		x = y;
	}
	// this should be in the database though
	public static void main(String[] args) {
		CharacterSheet c = new CharacterSheet(5);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
	}
	// UUAUAAAAAA
}	
