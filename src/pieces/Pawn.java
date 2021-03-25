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
			this.pieceName="wp";
		}
		else {
			this.pieceName="bp";
		}
		return this.pieceName;
	}

	@Override
	//TODO pawns can currently move backwards **FIXED**
	//TODO white pawns cant move up by 2 on first move but black can
	public boolean validMove(Board board, Spot startPosition, Spot endPosition) {

		int yChange=endPosition.getYCoordinate()-startPosition.getYCoordinate();
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		
		if ((board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()].getPiece()==null && ((yChange==1 && color == 1) || (yChange == -1 && color == 0)) && xChange==0) || (board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()].getPiece()!=null && xChange == 1 && ((yChange==1 && color == 1) || (yChange == -1 && color == 0))) || (board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()].getPiece()==null && this.first == true && yChange == 2 && xChange == 0)) {
			return true;
		}
		return false;
	}
	public boolean validMoveWithoutCheck(Board board, Spot startPosition, Spot endPosition) {
		if (!endPosition.isEmpty() && endPosition.getPiece().getColor()==this.getColor()) {  //same color piece
			return false;
		}

		int yChange=endPosition.getYCoordinate()-startPosition.getYCoordinate();
		int xChange=Math.abs(endPosition.getXCoordinate()-startPosition.getXCoordinate());
		
		if ((board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()].getPiece()==null && ((yChange==1 && color == 1) || (yChange == -1 && color == 0)) && xChange==0) || (board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()].getPiece()!=null && xChange == 1 && ((yChange==1 && color == 1) || (yChange == -1 && color == 0))) || (board.grid[endPosition.getXCoordinate()][endPosition.getYCoordinate()].getPiece()==null && this.first == true && ((yChange == 2 && color == 1) || (yChange == -2 && color == 0))   && xChange == 0)) {
			return true;
		}
		return false;
	}

}