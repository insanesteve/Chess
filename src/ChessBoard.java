
public class ChessBoard {
	boolean gameIsOver = false;
	private static final int SQUARES_ACROSS= 8;
	private static final int SQUARES_DOWN= 8;
	//the array should initialize to null in all spaces
	private Piece[][] squares = new Piece[SQUARES_ACROSS][SQUARES_DOWN];


	public void initialize (){
		for (int i = 0; i < SQUARES_ACROSS; i ++){
			//initialize white pawns
			squares[1][i] = new Pawn(color.WHITE);
		}

		for (int i = 0; i < SQUARES_ACROSS; i++){
			//initialize black pawns
			squares[SQUARES_DOWN - 2][i] = new Pawn(color.BLACK);
		}
	}

	public boolean gameOver(){
		return gameIsOver;
	}

	public void displayBoard(){
		//print 8 rows of the board
		for (int i = 0; i < SQUARES_DOWN; i++){
			//the code below prints one row of the board
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
				//if the pointer is not null, it has a piece on it.
				if (squares[i][j] != null){
				c = squares[i][j].getDispChar();
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


}
