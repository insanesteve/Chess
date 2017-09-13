
public class ChessBoard {
	boolean gameIsOver = false;
	private static final int SQUARES_ACROSS= 8;
	private static final int SQUARES_DOWN= 8;
	//the array should initialize to null in all spaces
	private Piece[][] squares = new Piece[SQUARES_ACROSS][SQUARES_DOWN];


	public void initialize (){
		for (int i = 0; i < SQUARES_ACROSS; i ++){
			//initialize white pawns
			squares[i][1] = new Pawn(color.WHITE);
		}

		for (int i = 0; i < SQUARES_ACROSS; i++){
			//initialize black pawns
			squares[i][SQUARES_DOWN - 2] = new Pawn(color.BLACK);
		}
	}

	public boolean gameOver(){
		return gameIsOver;
	}

	public void displayBoard(){
		for (int i = 0; i < SQUARES_DOWN; i++){
			for (int j = 0; j < SQUARES_ACROSS -1 ; j++){
				System.out.print("#######");
			}
			System.out.println();
			for (int j = 0; j < SQUARES_ACROSS; j++){
				System.out.print("#     ");
			}
			System.out.print("#");
			System.out.println();
			for (int j = 0; j < SQUARES_ACROSS; j++){
				char c = ' ';
				if (squares[j][i] != null){
				c = squares[j][i].getDispChar();
				}
				System.out.print("#  " + c + "  ");
			}
			System.out.print("#");
			System.out.println();

			for (int j = 0; j < SQUARES_ACROSS; j++){
				System.out.print("#     ");
			}
			System.out.print("#");
			System.out.println();
		}
		
		for (int j = 0; j < SQUARES_ACROSS -1; j++){
			System.out.print("#######");
		}
		System.out.println();
	}

	/*public void displayBoard(){
		for (int i = 0; i < SQUARES_ACROSS; i++){
			for (int j = 0; j < SQUARES_DOWN; j++){
				if (squares[j][i] != null) printSquare(squares[j][i].getDispChar());
				else printSquare(' ');
			}
			//System.out.println();
		}
	}
	 */

}
