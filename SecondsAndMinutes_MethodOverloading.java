package Challenges;

public class SecondsAndMinutes_MethodOverloading {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		
		System.out.println(getDurationString(-1, 4));
		System.out.println(getDurationString(11113325));
		System.out.println(getDurationString(1345, 12));
		System.out.println(getDurationString(45, 61));
		System.out.println(getDurationString(67, 3));

	}
	
	
	
	public static String getDurationString (int minutes, int seconds) {
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			return INVALID_VALUE_MESSAGE;
		}
		
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		
		
		String stringHours = hours + "h";
		String stringMinutes = remainingMinutes + "m";
		String stringSeconds = seconds + "s";
			if (hours < 10) {
				stringHours = "0" + stringHours;
			}
			
			if (remainingMinutes < 10) {
				stringMinutes = "0" + stringMinutes;
			}
			
			if (seconds < 10) {
				stringSeconds = "0" + stringSeconds;
			}
				
		
		return stringHours + " " + stringMinutes + " " + stringSeconds;
	}
	
	public static String getDurationString(int seconds) {
		
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		return getDurationString(minutes, remainingSeconds);
	}

}
