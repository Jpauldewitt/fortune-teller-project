import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// first name
		System.out.println("What is your first name?");
		String firstNameResponse = input.next().toLowerCase();

		if (firstNameResponse.equals("quit")) {
			System.out.println("Nobody likes a quitter!");
			System.exit(0);
		}

		// last name
		System.out.println("What is your last name?");
		String lastNameResponse = input.next().toLowerCase();

		if (lastNameResponse.equals("quit")) {
			System.out.println("Nobody likes a quitter!");
			System.exit(0);
		}

		// age
		System.out.println("How old are you?");
		String ageResponse = input.next();

		if (ageResponse.equals("quit")) {
			System.out.println("Nobody likes a quitter!");
			System.exit(0);
		}

		// birth month
		System.out.println("Please enter the number of your birth month:");
		String monthResponse = input.next().toLowerCase();
		Boolean validMonth = true;

		while (true) {
			if (monthResponse.equals("1") 
			|| (monthResponse.equals("2") 
			|| (monthResponse.equals("3") 
			|| (monthResponse.equals("4")
			|| (monthResponse.equals("5") 
			|| (monthResponse.equals("6") 
			|| (monthResponse.equals("7")
			|| (monthResponse.equals("8") 
			|| (monthResponse.equals("9")
			|| (monthResponse.equals("10")
			|| (monthResponse.equals("11") 
			|| (monthResponse.equals("12"))))))))))))) {
				validMonth = true;
				break;
			}

			else if (monthResponse.equals("quit")) {
				System.out.println("Nobody likes a quitter!");
				System.exit(0);
			}

			else {
				validMonth = false;
				System.out.println("Try again... Please enter a valid number for your birth month:");
				monthResponse = input.next();
			}
		}

		// favorite ROYGBIV color
		System.out.println("What is your favorite ROYGBIV color?");
		System.out.println("If you do not know what ROYGBIV is, please enter the word HELP");
		String colorResponse = input.next().toLowerCase();
		Boolean validColor = true;

		while (true) {
			if (colorResponse.equals("red") 
			|| (colorResponse.equals("orange") 
			|| (colorResponse.equals("yellow")
			|| (colorResponse.equals("green") 
			|| (colorResponse.equals("blue")
			|| (colorResponse.equals("indigo") 
			|| (colorResponse.equals("violet")))))))) {
				validColor = true;
				break;
			}

			// ROYGBIV help display
			else if (colorResponse.equals("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				System.out.println("Please enter one of these valid ROYGBIV colors:");
				colorResponse = input.next();
			}

			else if (colorResponse.equals("quit")) {
				System.out.println("Nobody likes a quitter!");
				System.exit(0);
			}

			else {
				validColor = false;
				System.out.println("Try again... Enter a valid ROYGBIV color, or type in the word HELP:");
				colorResponse = input.next();
			}
		}

		// number of siblings
		System.out.println("How many siblings do you have?");
		String siblingResponse = input.next().toLowerCase();

		if (siblingResponse.equals("quit")) {
			System.out.println("Nobody likes a quitter!");
			System.exit(0);
		}

		// retirement odd numbers = 3 years and even numbers = 10 years
		int retirementOutput = Integer.parseInt(ageResponse);

		// odd numbers
		if (retirementOutput % 2 == 1) {
			retirementOutput = (1);
		}

		// even numbers
		else {
			retirementOutput = (20);
		}

		// bank balance based on birth month
		String bankBalance = null;
		if (monthResponse.equals("1")
			|| (monthResponse.equals("2") 
			|| (monthResponse.equals("3") 
			|| (monthResponse.equals("4"))))) {
			bankBalance = "$1,000,000.00";
		}

		else if (monthResponse.equals("5")
			|| (monthResponse.equals("6") 
			|| (monthResponse.equals("7") 
			|| (monthResponse.equals("8"))))) {
			bankBalance = "$2.00";
		}

		else if (monthResponse.equals("9")
			|| (monthResponse.equals("10") 
			|| (monthResponse.equals("11") 
			|| (monthResponse.equals("12"))))) {
			bankBalance = "$33.33";
		}

		else {
			bankBalance = "$0.01";
		}

		// location based on number of siblings
		String location = null;
		if (siblingResponse.equals("0")) {
			location = "Jacksonville, Florida";
		}

		else if (siblingResponse.equals("1")) {
			location = "Tijuana, Mexico";
		}

		else if (siblingResponse.equals("2")) {
			location = "Seattle, Washington";
		}

		else if (siblingResponse.equals("3")) {
			location = "Columbus, Ohio";
		}

		else if (siblingResponse.contains("-")) {
			location = "Springfield, Ohio";
		}

		else {
			location = "Canada";
		}

		// transportation based on favorite ROYGBIV color
		String transportation = null;

		if (colorResponse.equals("red")) {
			transportation = "rollerskates";
		} 
		else if (colorResponse.equals("orange")) {
			transportation = "honda civic";
		} 
		else if (colorResponse.equals("yellow")) {
			transportation = "skateboard";
		} 
		else if (colorResponse.equals("green")) {
			transportation = "zebra";
		} 
		else if (colorResponse.equals("blue")) {
			transportation = "the sports car of your dreams";	
		} 
		else if (colorResponse.equals("indigo")) {
			transportation = "word of mouth";
		}
		else if (colorResponse.equals("violet")) {
			transportation = "scooter";
		}
		else {
			transportation = "foot";
		}

		// final output
		System.out.println(firstNameResponse + " " + lastNameResponse 
				+ " will retire in " + retirementOutput + " years with " 
				+ bankBalance + " in the bank, a vacation home in " + location 
				+ ", and will travel by " + transportation + ".");
	}
}
