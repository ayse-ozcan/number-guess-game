package numberguess;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public int computerInput;
	public int userInput;

	public Game() {

		Random random = new Random();
		computerInput = random.nextInt(100);
	}

	public void takeUserInput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("**********************");
		System.out.println("*****GUESS-NUMBER*****");
		System.out.println("**********************");
		System.out.print("\nEnter number: ");
		userInput = scanner.nextInt();
	}

	boolean isCorrectNumber() {

		if (userInput == computerInput) {
			System.out.println("Congrats!!");
			return true;
		} else if (userInput < computerInput) {
			System.out.println("Your number is less than the computer number...Try again");
		} else if (userInput > computerInput) {
			System.out.println("Your number is greater than the computer number...Try again");
		}
		return false;
	}
}
