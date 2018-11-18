package Challenges;

public class DayOfTheWeek {

	public static void main(String[] args) {

		printDayOfWeek(2);
		printDayOfWeek(5);
		printDayOfWeek(7);
		
		
		isLeapYear(4);
		isLeapYear(100);
		isLeapYear(40);
		isLeapYear(79);
		isLeapYear(49);
		isLeapYear(800);
	}
	
	private static void printDayOfWeek(int day) {
		
		switch(day) {
			case 0:
				System.out.println("Today is Sunday");
				break;
			case 1:
				System.out.println("Today is Monday");
				break;
			case 2:
				System.out.println("Today is Tuesday");
				break;
			case 3:
				System.out.println("Today is Wednesday");
				break;
			case 4:
				System.out.println("Today is Thursday");
				break;
			case 5:
				System.out.println("Today is Friday");
				break;
			case 6:
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
	
public static boolean isLeapYear(int year) {
        
        boolean result = false;
        
        if (year>0 && year <= 9999) {
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                result = true;
            }
        }
        
        System.out.println(result);
        return result;
    }

}
