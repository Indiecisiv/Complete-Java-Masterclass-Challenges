package Challenges;

public class DigitSum extends switchStatements {

	public static void main(String[] args) {
		sumDigits(1);
		sumDigits(100);
		sumDigits(1000);
		sumDigits(128);
		sumDigits(312);
		sumDigits(512);
		sumDigits(1024);
		sumDigits(9);
		

	}
	
	private static int sumDigits(int number) {
		
		int sum = 0;
		
		if (number < 10) {
			return -1;
		}
		
		while(number > 0) {
			int digit = number % 10;
			sum += digit;
			
			number /= 10;
		}
		System.out.println(sum);
		return sum;
	}

}
