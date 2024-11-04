package base;

import java.util.Scanner;

public class ThrowDemo {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		if(age<18){
			throw new Exception("Age should be atleast 18 to vote");
		}else {
			System.out.println("You are eligible for voting.");
		}
	}
}

