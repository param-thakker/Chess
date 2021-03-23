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
		//black pieces
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

		//white pieces
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

		//set rest of the Spots to null pieces
		for (int a=0;a<8;a++) {
			for (int b=2;b<6;b++) {
				grid[a][b] = new Spot(a, b, null);
			}
		}
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
	public void drawBoard(){
		String[][] sboard = new String[8][8];

		int color = 0;
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				if (color == 0){
					sboard[i][j] = "   ";
					color = 1;
				}else{
					sboard[i][j] = "## ";
					color = 0;
				}
			}
			color = color == 0 ? 1 : 0;
		}
		for (int a = 0; a < 8; a++){
			for (int b = 0; b < 8; b++){
				if (this.grid[a][b].getPiece() != null){
					sboard[a][b] = this.grid[a][b].getPiece().getPieceName() + " " ;
				}
			}
		}


		System.out.println();
		for (int a = 0; a < 8; a++){
			for (int b = 0; b < 8; b++){
				System.out.print(sboard[b][a]);
			}
			System.out.print(8-a);
			System.out.println();
		}
		System.out.println(" a  b  c  d  e  f  g  h");
	}

}
