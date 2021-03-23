package chess;

import java.util.*;
import java.io.*;


public class Chess {
	public static Board chessBoard;
	static boolean whiteTurn=true;

	public static void main(String[] args) {
		setUpGame();
		Scanner sc=new Scanner(System.in);
		String input="";
		while (true) {
			if (whiteTurn) {
				System.out.println();
				System.out.print("White's move: ");
			}
			else {
				System.out.println();
				System.out.print("Black's move: ");
			}
			input=sc.nextLine();
			newBoardState(input);
		}
		
	}
	public static void setUpGame() {
		chessBoard=new Board();
		String[][] board = new String[8][8];

		int color = 0;
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				if (color==0){
					board[i][j] = "   ";
					color = 1;
				}else{
					board[i][j] = "## ";
					color = 0;
				}
			}
			color=color==0?1:0;
		}	
		for (int a = 0; a < 8; a++){
			for (int b = 0; b < 8; b++){
				if ( chessBoard.grid[a][b] != null){
					board[a][b] = chessBoard.grid[a][b].getPiece().getPieceName() + " " ;
				}
			}
		}
		
		 
		System.out.println();
		for (int a = 0; a < 8; a++){
			for (int b = 0; b < 8; b++){
				System.out.print(board[b][a]);
			}
			System.out.print(8-a);
			System.out.println();
		}
		System.out.println(" a  b  c  d  e  f  g  h"); 
	}
	
	public static void newBoardState(String input) {
		String[] tokens=input.trim().toLowerCase().split("\\s+");
		if (tokens.length==0) {
			System.out.println("Illegal move, try again");
			if (whiteTurn) {
				System.out.println("White's move: ");
			}
			else {
				System.out.println("Black's move: ");
			}	
		}
		else if (tokens.length==1) {
			if (tokens[0].equals("resign")) {
				if (whiteTurn) {
					System.out.println("Black wins");
				}
				else {
					System.out.println("White wins");
				}
				System.exit(1);
			}
			
			
		}
		else if (tokens.length==2) {
			
		}
	}
	
	
	
	/*  0  1  2  3  4  5  6  7  
	 *|bR|bN|bB|bQ|bK|bB|bN|bR| 0  j
	 *|bP|bP|bP|bP|bP|bP|bP|bP| 1
	 *|  |##|  |##|  |##|  |##| 2
	 *|##|  |##|  |##|  |##|  | 3
	 *|  |##|  |##|  |##|  |##| 4
	 *|##|  |##|  |##|  |##|  | 5
	 *|wP|wP|wP|wP|wP|wP|wP|wP| 6
	 *|wR|wN|wB|wQ|wK|wB|wN|wR| 7  */
	
}
