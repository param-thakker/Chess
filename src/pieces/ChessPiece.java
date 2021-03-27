package pieces;
import chess.Board;
import chess.Spot;

/**
 * ChessPiece is the abstract class for the Chess game and it specifies the functionality of every Chess piece
 * @author Param Thakker
 * @author Jonathan Lu
 *
 */
public abstract class ChessPiece {
	boolean dead;
	int color=0; //0 for white, 1 for black
	int x;
	int y;
	boolean first=true;
	int previousChange;
	
	public boolean isDead() { return dead; }
	public void Dead() { dead = true; }
	
	/**
	 * setColor method is used to assign a piece to a color
	 * @param piece    The color (black/white) of the piece
	 */
	
	public void setColor(int piece) {
		this.color = piece;
	}
	/**
	 * getColor method is used to get the color of a piece
	 * @return    The color of the piece
	 */
	public int getColor() {
		return this.color;
	}
	

	/** getPieceName is used to return the piece abbreviation (wN or bN here)
	 *  @return  The piece abbreviation
	 */
	
	public abstract String getPieceName();

	/** validMove method is used to check if a piece is attempting a valid move
	 * @param board          The chessboard
	 * @param startPosition  The position where the piece is currently located
	 * @param endPosition    The position where the piece is attempting to move
	 * @return               True if the move is valid, false otherwise
	 */
	public abstract boolean validMove(Board board, Spot startPosition, Spot endPosition);
	
	public abstract boolean validMoveWithoutCheck(Board board, Spot startPosition, Spot endPosition);

	public abstract int getPreviousChange();
}
