package pieces;
import chess.Board;

public class King extends ChessPiece{
	boolean castled = false;
	
	public King(int x, int y) {
		super(x, y);
		
	}
	public void castle() { castled = true; }
	public boolean checkCastled() { return castled; }

	public boolean validMove(Board board, int xf, int yf) {
		//TODO kings valid moves
		return true;
	}
}
