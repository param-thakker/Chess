package pieces;
import chess.Board;
import chess.Spot;

/**
 * The Knight class is an extension of the ChessPiece class and creates a Knight Piece.
 * @author Param Thakker
 * @author Jonathan Lu
 *
 */

public class Knight extends ChessPiece {
	
	String pieceName="N";
	int pieceColor=0;
	int previousChange = 0;
	public Knight(int color) {
		this.setColor(color);
		this.pieceColor=color;
	}
	public Knight(int color, int previousChange) {
		this.setColor(color);
		this.pieceColor=color;
		this.previousChange = previousChange;
	}
	public int getPreviousChange() {
		return previousChange;
	}

	
	/** getPieceName is used to return the piece abbreviation (wN or bN here)
	 *  @return  The piece abbreviation
	 */
	
	@Override
	public String getPieceName() {
		if (pieceColor==0) {
			this.pieceName="wN";
		}
		else {
			this.pieceName="bN";
		}
		return this.pieceName;
	}


	
	/** validMove method is used to check if a piece is attempting a valid move
	 * @param board          The chessboard
	 * @param startPosition  The position where the piece is currently located
	 * @param endPosition    The position where the piece is attempting to move
	 * @return               True if the move is valid, false otherwise
	 */
	@Override
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {
		
		//L shape
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());

		if ((xChange == 2 && yChange == 1) || (xChange == 1 && yChange == 2)){
			previousChange = yChange;
			return true;
		}
		return false;
		
	}
	/** 
	 * @param board          The chessboard
	 * @param startPosition  The position where the piece is currently located
	 * @param endPosition    The position where the piece is attempting to move
	 * @return               True if the move is valid, false otherwise
	 */
	public boolean validMoveWithoutCheck(Board board, Spot startPosition, Spot endPosition) {
		if (!endPosition.isEmpty() && endPosition.getPiece().getColor()==this.getColor()) {
			return false;
		}

		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());

		if ((xChange == 2 && yChange == 1) || (xChange == 1 && yChange == 2)){
			previousChange = yChange;
			return true;
		}
        return false;
		
	}

}