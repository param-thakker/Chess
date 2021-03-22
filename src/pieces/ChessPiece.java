package pieces;
import chess.Board;
import chess.Spot;

public abstract class ChessPiece {
	boolean dead;
	int color=0; //0 for white, 1 for black
	int x;
	int y;
	boolean first=true;
	
	/*public ChessPiece(int x, int y) {
		this.x = x;
		this.y = y;
		dead = false;
	}*/
	
	public boolean isDead() { return dead; }
	public void Dead() { dead = true; }
	
	public void setColor(int piece) {
		this.color = piece;
	}
	public int getColor() {
		return this.color;
	}
	
	
	public abstract String getPieceName();
	
	public abstract boolean validMove(Board board, Spot startPosition, Spot endPosition);
	
}
