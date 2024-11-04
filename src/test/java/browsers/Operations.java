package browsers;
import java.util.Scanner;

public class Operations {
	

	public static void main(String[]args) {
		/*
		 * Scanner input1 = new Scanner(System.in);
		 * System.out.println("Enter the number "); int a = input1.nextInt();
		 * 
		 * Scanner input2 = new Scanner(System.in);
		 * System.out.println("Enter the number "); int b = input2.nextInt();
		 */
		int a=5;
		int b=5;
	}
		public void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public void diff(int a, int b) {
		int diff = a-b;
		System.out.println(diff);
	}
	
	public void mult(int a, int b) {
		int res = a*b;
		System.out.println(res);
	}
	public void div(int a, int b) {
		int res = a/b;
		System.out.println(res);
	}
	
}
