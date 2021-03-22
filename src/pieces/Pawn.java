package pieces;
import chess.Board;
import chess.Spot;

public class Pawn extends ChessPiece{
	String pieceName="p";
	int pieceColor=0;
	public Pawn(int color) {
		this.setColor(color);
		this.pieceColor=color;
	}

	@Override
	public String getPieceName() {
		if (pieceColor==0) {
			this.pieceName="w" + this.pieceName;
		}
		else {
			this.pieceName="b" + this.pieceName;
		}
		return this.pieceName;
	}

	@Override
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {
		if (endPosition!=null && endPosition.getPiece().getColor()==this.getColor()) {   
			return false;
		}
		int yChange=Math.abs(endPosition.getYCoordinate()-startPosition.getYCoordinate());
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		
		if ((board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()]==null && yChange==1 && xChange==0) || (board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()]!=null && xChange == 1 && yChange == 1) || (board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()]==null && this.first == true && yChange == 2 && xChange == 0)) {
			return true;
		}
		return false;
	}

}