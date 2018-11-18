package Challenges;

import java.util.Scanner;

public class readingUserInput extends DigitSum {

	public static void main(String[] args) {
		System.out.println("Please enter your number");
		Scanner scanner = new Scanner(System.in);	
		
		boolean hasNextInt = scanner.hasNextInt();
		int sum = 0;
		int remaining = 10;

		for(int i = 0; i < 10; i++) {
			
			System.out.print("You have "  + remaining + " numbers left to enter.\n");
			if(hasNextInt) {
				
				int number = scanner.nextInt();
				remaining--;
				sum += number;
				
			} else {
				System.out.println("Invalid Number.");
			}
			
		}
		scanner.close();
		System.out.println("The sum of your 10 numbers is: " + sum);
	}

}
