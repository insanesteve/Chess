
public class Pawn extends Piece{

	Pawn(color pieceColor) {
		super(pieceColor);
	}

	@Override 
	public char getDispChar(){
		return 'P';
	}

}
