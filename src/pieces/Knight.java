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

        return xChange * yChange == 2;
		
	}

}