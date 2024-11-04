package base;  // Declares that this class is part of the 'base' package

class HelloWorld2 {  // Defines a class named HelloWorld2
    public static void main(String[] args) {  // Main method, entry point of the program
        String input = "*&” #$%^&*1234$%^^&   Inter….   view%^&^ “#$\"";  // Initializes a String variable 'input' with special characters, numbers, letters, and spaces

        StringBuilder result = new StringBuilder();  // Creates a StringBuilder object 'result' to build a cleaned version of the 'input' string

        boolean lastCharWasSpace = false;  // Boolean flag to track if the last character added was a space

        for (char c : input.toCharArray()) {  // Loops through each character 'c' in the 'input' string

            if (Character.isLetterOrDigit(c)) {  // Checks if 'c' is an alphanumeric character (letter or digit)
                
                result.append(c);  // Adds the alphanumeric character to 'result'

                lastCharWasSpace = false;  // Sets the flag to false since the last character added was not a space
            }
            else if (c == ' ' && !lastCharWasSpace && result.length() > 0) {  // Checks if 'c' is a space, the last character wasn't a space, and 'result' isn't empty

                result.append(' ');  // Adds a single space to 'result'

                lastCharWasSpace = true;  // Sets the flag to true, indicating the last character added was a space
            }
        }

        System.out.println("Alphanumeric characters: " + result.toString().trim());  // Prints the cleaned string of alphanumeric characters with single spaces in between, trimmed of leading and trailing spaces
    }
}
