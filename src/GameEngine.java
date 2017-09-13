import java.util.Scanner;

public class GameEngine {

	GameEngine(){
		
	}
	
	public void playGame(){
		//gather player info
		
		System.out.print("Enter a name for player 1 (white): ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		Player white = new Player(userInput);
		System.out.print("Enter a name for player 2 (black): ");
		userInput = sc.nextLine();
		Player black = new Player(userInput);
		
		//create and initialize the board
		ChessBoard board = new ChessBoard();
		board.initialize();
	}
	
	
	
	public static void main (String [] args){
		System.out.println("HelloWorld");
		GameEngine game = new GameEngine();
		game.playGame();
		System.out.println("playGame returned.");
	}
}


