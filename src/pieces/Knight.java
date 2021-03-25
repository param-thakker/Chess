package pieces;
import chess.Board;
import chess.Spot;

public class Knight extends ChessPiece{
	
	String pieceName="N";
	int pieceColor=0;
	public Knight(int color) {
		this.setColor(color);
		this.pieceColor=color;
	}
	

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

	@Override
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {
		
		//L shape
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		//3.23 DOESNT WORK PROPERLY
        return (xChange == 2 && yChange == 1) || (xChange == 1 && yChange == 2);
		
	}
	public boolean validMoveWithoutCheck(Board board, Spot startPosition, Spot endPosition) {
		if (!endPosition.isEmpty() && endPosition.getPiece().getColor()==this.getColor()) {
			return false;
		}
		//L shape
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		//3.23 DOESNT WORK PROPERLY
        return (xChange == 2 && yChange == 1) || (xChange == 1 && yChange == 2);
		
	}

}