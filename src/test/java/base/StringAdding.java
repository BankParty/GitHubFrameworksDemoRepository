package base;

public class StringAdding {
	
	public static void main(String[] args) {
		
	
		String str = "Auto Mation Test Ing";
		
		int lengthWithSpaces = str.length();
		
		int lengthWithoutSpaces = str.replace(" ", "").length();
		
		System.out.println("length  with spaces: "+lengthWithSpaces); 
		System.out.println("Length without spaces: " + lengthWithoutSpaces);
		

		
	}

}
