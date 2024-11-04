package base;

public class FindDuplicateCharacterinString {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Duplicate characters in the string:");

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Outer loop picks each character one by one
        for (int i = 0; i < charArray.length; i++) {
            int count = 1;

            // Skip if the character has already been checked (denoted by '*')
            if (charArray[i] == '*') {
                continue;
            }

            // Inner loop compares the current character with the rest of the array
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    // Mark the duplicate character as checked
                    charArray[j] = '*';
                }
            }

            // If the character is repeated, print it
            if (count > 1) {
                System.out.println(charArray[i]);
            }
        }
    }
}
