package numberguess;

public class NumberGuess {

	public static void main(String[] args) {
		
	Game game = new Game();
	boolean bool = false;
	
	while(!bool) {
		
		game.takeUserInput();
		bool = game.isCorrectNumber();
		System.out.println(bool);
	}
	}
}
