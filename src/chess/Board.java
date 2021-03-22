package chess;
import pieces.Rook;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;

public class Board {
	public Spot[][] grid;
	
	public Board() {
		grid=new Spot[8][8];
		makeStartBoard();
	}
	
	public void makeStartBoard() {
		//TODO set starting positions of all pieces
		for (int a=0;a<8;a++) {
			for (int b=0;b<8;b++) {
				grid[a][b]=null;
			}
		}
		grid[0][0] = new Spot(0, 0, new Rook(1));
		grid[0][1] = new Spot(0, 1, new Pawn(1));
		grid[1][0] = new Spot(1, 0, new Knight(1));
		grid[1][1] = new Spot(1, 1, new Pawn(1));
		grid[2][0] = new Spot(2, 0, new Bishop(1));
		grid[2][1] = new Spot(2, 1, new Pawn(1));
		grid[3][0] = new Spot(3, 0, new Queen(1));
		grid[3][1] = new Spot(3, 1, new Pawn(1));
		grid[4][0] = new Spot(4, 0, new King(1));
		grid[4][1] = new Spot(4, 1, new Pawn(1));
		grid[5][0] = new Spot(5, 0, new Bishop(1));
		grid[5][1] = new Spot(5, 1, new Pawn(1));
		grid[6][0] = new Spot(6, 0, new Knight(1));
		grid[6][1] = new Spot(6, 1, new Pawn(1));
		grid[7][0] = new Spot(7, 0, new Rook(1));
		grid[7][1] = new Spot(7, 1, new Pawn(1));
		
		grid[0][6] = new Spot(0, 6, new Pawn(0));
		grid[0][7] = new Spot(0, 7, new Rook(0));
		grid[1][6] = new Spot(1, 6, new Pawn(0));
		grid[1][7] = new Spot(1, 7, new Knight(0));
		grid[2][6] = new Spot(2, 6, new Pawn(0));
		grid[2][7] = new Spot(2, 7, new Bishop(0));
		grid[3][6] = new Spot(3, 6, new Pawn(0));
		grid[3][7] = new Spot(3, 7, new Queen(0));
		grid[4][6] = new Spot(4, 6, new Pawn(0));
		grid[4][7] = new Spot(4, 7, new King(0));
		grid[5][6] = new Spot(5, 6, new Pawn(0));
		grid[5][7] = new Spot(5, 7, new Bishop(0));
		grid[6][6] = new Spot(6, 6, new Pawn(0));
		grid[6][7] = new Spot(6, 7, new Knight(0));
		grid[7][6] = new Spot(7, 6, new Pawn(0));
		grid[7][7] = new Spot(7, 7, new Rook(0));
		
	/*	 *  0   1  2  3  4  5  6  7  
		 *|bR|bN|bB|bQ|bK|bB|bN|bR| 0  j
		 *|bP|bP|bP|bP|bP|bP|bP|bP| 1
		 *|  |##|  |##|  |##|  |##| 2
		 *|##|  |##|  |##|  |##|  | 3
		 *|  |##|  |##|  |##|  |##| 4
		 *|##|  |##|  |##|  |##|  | 5
		 *|wP|wP|wP|wP|wP|wP|wP|wP| 6
		 *|wR|wN|wB|wQ|wK|wB|wN|wR| 7  */
		
	}

}
