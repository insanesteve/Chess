
public class ChessBoard {
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
			squares[i][SQUARES_DOWN - 1] = new Pawn(color.BLACK);
		}
		
	}
	
}
