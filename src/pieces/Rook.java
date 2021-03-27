package pieces;
import chess.Board;
import chess.Spot;

/**
 * The Rook class is an extension of the ChessPiece class and creates a Rook Piece.
 * @author Param Thakker
 * @author Jonathan Lu
 *
 */
public class Rook extends ChessPiece{
	
	String pieceName="R";
	int pieceColor=0;
	int previousChange=0;
	public Rook(int color) {
		this.setColor(color);
		this.pieceColor=color;
	}

	public Rook(int color, int prevChange){
		this.setColor(color);
		this.pieceColor=color;
		this.previousChange = prevChange;
	}
	public int getPreviousChange() {
		return previousChange;
	}

	@Override
	public String getPieceName() {
		
		if (pieceColor==0) {
			this.pieceName="wR";
		}
		else {
			this.pieceName="bR";
		}
		return this.pieceName;
	}

	@Override
	//TODO currently can move through units lol
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {

		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());

		if ((xChange == 0 && yChange != 0) || (xChange != 0 && yChange == 0)){
			previousChange = yChange;
			return true;
		}
		return false;
		
	}
	public boolean validMoveWithoutCheck(Board board, Spot startPosition, Spot endPosition) {
		if (!endPosition.isEmpty() && endPosition.getPiece().getColor()==this.getColor()) {
			return false;
		}
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());

		if ((xChange == 0 && yChange != 0) || (xChange != 0 && yChange == 0)){
			previousChange = yChange;
			return true;
		}
		return false;
		
	}


}