
public abstract class Piece {
	protected color pieceColor;
	Piece (color pieceColor){
		this.pieceColor = pieceColor;
	}
	
	public char getDispChar(){
		return 'X';
	}
	
	
}
