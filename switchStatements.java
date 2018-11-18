package Challenges;

public class switchStatements {

	public static void main(String[] args) {
		
		char letter = 'C';
		
		switch(letter) {
			case 'A':
				System.out.println("The letter was A");
				break;
			case 'B':
				System.out.println("The letter was B");
				break;
			case 'C': case 'D': case 'E':
				System.out.println(letter + " was found");
				break;
			default:
				System.out.println("The letter was not found");
				break;
		}
		
		String month = "January";
		
		switch(month.toLowerCase()) {
			case "january":
				System.out.println("Jan");
				break;
			case "june":
				System.out.println("jun");
				break;
			default:
				System.out.println("not found");
		}

	}

}
