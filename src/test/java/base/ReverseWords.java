
package base; // Organizes the class into a package named 'base'. Helps with modularity and avoids naming conflicts.

public class ReverseWords { // Defines a public class named 'ReverseWords'. 'public' means it’s accessible from outside its package.

	public static void main(String[] args) { // Main method; entry point for Java applications.

		String input = "A quick brown fox jumps over the lazy dog"; // Declares and initializes a string variable with a sentence.

		String[] words = input.split(" "); // Uses 'split' method to divide 'input' at spaces, storing each word in a String array.

		StringBuilder result = new StringBuilder(); // Creates a StringBuilder object for efficient string concatenation.

		for (String word : words) { // A for-each loop that iterates through each word in the 'words' array.

			result.append(new StringBuilder(word).reverse().toString()).append(" "); // Reverses each word and appends it to 'result', followed by a space.
		}   
		System.out.println("Reversed words: " + result.toString().trim()); // Prints the reversed words as a single string, trimming any trailing spaces.
	}

} 
