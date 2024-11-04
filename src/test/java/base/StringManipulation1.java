package base;

public class StringManipulation1 {

	public static void main(String[] args) {
        String input = "Auto Mation Test Ing";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
      //Combine first two words ("Auto" + "Mation") -> "Automation"
     // Combine last two words ("Test" + "Ing") -> "Testing"
        String result = words[0] + words[1].toLowerCase() +" "+ words[2] 
        		+ words[3].toLowerCase();
        // Output the result
        System.out.println("Output String: " + result);
    }
} 