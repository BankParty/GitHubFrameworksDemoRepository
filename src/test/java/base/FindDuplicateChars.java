package base;

import java.util.HashSet;

public class FindDuplicateChars {

	public static void main(String[] args) {
		String str = "This is an actual interview Test";
		System.out.println("Duplicate characters in the string");
		
		// Convert the string to lowercase to treat 'T' and 't' as the same character
        str = str.toLowerCase();
        HashSet<Character> printed = new HashSet<>(); // Track characters already printed

		//outer loop picks each character
		for(int i=0; i<str.length(); i++) {
			int count = 0;
			
			//skip spaces
			if(str.charAt(i) ==' ' || printed.contains(str.charAt(i))) {
				continue;
			}
			// Inner loop compares the current character with the rest of the string
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					}
			}
				if(count>0) {
					System.out.println(str.charAt(i));
					printed.add(str.charAt(i)); // Mark as printed
					
				}
			}

		}
	}
