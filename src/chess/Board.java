package chess;
import pieces.Rook;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;

public class Board {
	Spot[][] grid = new Spot[8][8];
	
	public void makeStartBoard() {
		//TODO set starting positions of all pieces
		//grid[0][0] = new Spot(0, 0, new Rook(0, 0)); //this is kinda a mess rn but itll change
		grid[0][1] = new Spot(0, 1, new Knight(0, 1));
		//etc etc
	}

}
