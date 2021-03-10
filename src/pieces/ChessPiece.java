package pieces;
import chess.Board;

public abstract class ChessPiece {
	boolean dead;
	int color; //0 for white, 1 for black
	int x;
	int y;
	
	public ChessPiece(int x, int y) {
		this.x = x;
		this.y = y;
		dead = false;
	}
	
	public boolean isDead() { return dead; }
	public void Dead() { dead = true; }
	public void setColor(int ytblk) {
		ytblk = color;
	}
	
	
	
	public abstract boolean validMove(Board board, int xf, int yf);
}
