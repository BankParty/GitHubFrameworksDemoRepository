package base; 

import java.util.ArrayList; // Imports ArrayList for storing character positions
import java.util.HashMap; // Imports HashMap for storing character counts and positions

public class countofLettersNpositions {
	public static void main(String[] args) { 
		String str = "This is an actual Test"; // Initializes the input string to analyze
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); // HashMap to store character counts
		HashMap<Character, ArrayList<Integer>> positions = new HashMap<>(); // HashMap to store positions of each character
		str = str.toLowerCase(); // Converts the string to lowercase for case-insensitive analysis

		// Loop to count characters and track positions
		for(int i = 0; i < str.length(); i++){ // Iterates over each character in the string
			char currentChar = str.charAt(i); // Gets the character at index 'i'
			if(currentChar != ' ') { // Skips spaces
				hm.put(currentChar, hm.getOrDefault(currentChar, 0) + 1); // Updates character count in 'hm'

				if(!positions.containsKey(currentChar)) { // Checks if the character is already in 'positions'
					positions.put(currentChar, new ArrayList<Integer>()); // Initializes a new ArrayList if character not present
				}
				positions.get(currentChar).add(i); // Adds the character's position to its list in 'positions'
			}
		}

		// Print the counts and positions
		for(char c : hm.keySet()) { // Loops over each character in 'hm' to display results
			System.out.println(c + " : " + hm.get(c) + " | Positions: " + positions.get(c)); // Prints character, its count, and positions
		}
	}
}
