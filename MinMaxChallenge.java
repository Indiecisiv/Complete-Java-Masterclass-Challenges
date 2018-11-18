package Challenges;
import java.util.Scanner;

public class MinMaxChallenge {	
	
	static boolean firstNumber = true;
	static int minNumber;
	static int maxNumber;
	
	public static void main(String[] args) {
		
	
		
		Scanner input = new Scanner(System.in);
		String start = "Enter number";
		
		while(true) {
			System.out.println(start);
			
			int currentNumber = input.nextInt();
			
			displayMin(currentNumber);
			displayMax(currentNumber);
			System.out.println("\n");
			firstNumber = false;
		}
	}
	
	public static void displayMin(int currentNumber) {
		if (firstNumber == true) {
			minNumber = currentNumber;
		}
		
		if(currentNumber < minNumber) {
			minNumber = currentNumber;
		}
		
		System.out.println("The current lowest number enetered is: " + minNumber);
	}
	
	public static void displayMax(int currentNumber) {	
		if (firstNumber == true) {
			maxNumber = currentNumber;
		}
		
		if(currentNumber > maxNumber) {
			maxNumber = currentNumber;
		}
		
		System.out.println("The current highest number enetered is: " + maxNumber);
	}
	
}
