package base;

import java.util.Scanner;

public class ReverseaString {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		
		String str = scanner.nextLine();
		
		//Initialize an empty string to store the reversed string
		String reversed = " ";
		
		// Iterate through the string from the last character to the first
		for(int i=str.length()-1; i>=0; i--) {
			reversed +=str.charAt(i); // Append each character to 'reversed'
		}
		
		// Output the manually reversed string
		System.out.println("Reversed string: " + reversed);
	}

}
	