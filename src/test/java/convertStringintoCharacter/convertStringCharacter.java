package convertStringintoCharacter;

public class convertStringCharacter {
	
	//main driver method
	public static void main(String args[]) {
	String str="kartic";
	
	//creating array of string length using length() method
	char[] ch = new char[str.length()];
	
	//copying character by character  into array using for each loop
	
for(int i=0; i<str.length(); i++) {
	ch[i] = str.charAt(i);
}
//printing the elements of array using for each loop
for (char c: ch) {
	System.out.println(c);
}
}	
}


