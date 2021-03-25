package pieces;
import chess.Board;
import chess.Spot;

public class Queen extends ChessPiece{
	
	String pieceName="Q";
	int pieceColor=0;
	public Queen(int color) {
		this.setColor(color);
		this.pieceColor=color;
	}
	

	@Override
	public String getPieceName() {
		
		if (pieceColor==0) {
			this.pieceName="wQ";
		}
		else {
			this.pieceName="bQ";
		}
		return this.pieceName;
	}

	@Override
	//TODO queens can currently move through units lol (for ex on the first turn you can capture black queen as white queen)
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		
		return ((xChange==yChange) || (xChange == 0 && yChange != 0) || (xChange != 0 && yChange == 0));
		
	}
	public boolean validMoveWithoutCheck(Board board, Spot startPosition, Spot endPosition) {
		if (!endPosition.isEmpty() && endPosition.getPiece().getColor()==this.getColor()) {
			return false;
		}
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		
		return ((xChange==yChange) || (xChange == 0 && yChange != 0) || (xChange != 0 && yChange == 0));
		
	}

}