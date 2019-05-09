package Deliverable1;

import java.util.Scanner;

public class whatToEat {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String mealSuggestion = "";
		String prepSuggestion = "";

// Prompt for and receive user event type input.

		System.out.println("What type of event are you planning?");
		System.out.println("Your choices are: casual, semi-formal, or formal.");

		String eventType = scnr.nextLine();

//Prompt for and receive party size input.

		System.out.println("What is the number of guests?");

		int partySize = scnr.nextInt();

//Meal suggestion based on event type.	

		if (eventType.equalsIgnoreCase("casual")) {
			mealSuggestion = "sandwiches";
		} else if (eventType.equalsIgnoreCase("semi-formal")) {
			mealSuggestion = "fried chicken";
		} else if (eventType.equalsIgnoreCase("formal")) {
			mealSuggestion = "chicken parmesan";
		}

// Preparation suggestion based on party size.		

		if (partySize == 1) {
			prepSuggestion = "in the microwave";
		} else if ((partySize >= 2) && (partySize < 13)) {
			prepSuggestion = "in your kitchen";
		} else if (partySize > 12) {
			prepSuggestion = "by a caterer";
		}

// Print result to console.		

		String result = "Since you are hosting a " + eventType + " event for " + partySize
				+ " participants, you should serve " + mealSuggestion + " prepared " + prepSuggestion + ".";

		System.out.println(result);

	}

}