package chess;
import pieces.ChessPiece;

public class Spot {
	int x;
	int y;
	ChessPiece piece;
	
	public Spot(int x, int y, ChessPiece piece) {
		this.x = x;
		this.y = y;
		this.piece = piece;
	}

}
