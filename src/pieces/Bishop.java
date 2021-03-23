package pieces;
import chess.Board;
import chess.Spot;

public class Bishop extends ChessPiece{
	
	String pieceName="B";
	int pieceColor=0;
	public Bishop(int color) {
		this.setColor(color);
		this.pieceColor=color;
	}
	

	@Override
	public String getPieceName() {
		
		if (pieceColor==0) {
			this.pieceName="wB";
		}
		else {
			this.pieceName="bB";
		}
		return this.pieceName;
	}

	@Override
	//TODO currently can move through units lol
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {
		if (!endPosition.isEmpty() && endPosition.getPiece().getColor()==this.getColor()) {
			return false;
		}
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		
		return yChange==xChange;
		
	}

}