package Challenges;

public class MethodOverloading {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(7, 5);
		calcFeetAndInchesToCentimeters(11);
		calcFeetAndInchesToCentimeters(165);
		double centimeters = calcFeetAndInchesToCentimeters(-1, 4);
		if(centimeters < 0.0) {
			System.out.println("Invalid parameters");
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("Invalid feet or inches");
			return -1;	
		}
		
			double centimeters = (feet * 12) * 2.54;
			centimeters += inches * 2.54 ;
			System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
			return centimeters;
	
	}
	
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + "inches.");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

}
