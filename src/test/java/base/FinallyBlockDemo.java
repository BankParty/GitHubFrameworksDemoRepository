package base;

import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
		scanner = new Scanner(System.in);
		System.out.println("Enter any number");
			int a = 5, b = 0, c;
			
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			
			System.out.println(e);
		}finally {
			scanner.close();
			System.out.println("Scanner object got closed");
		}
		System.out.println("End of this program");
		
		

	}

}
