package chess;

import java.util.*;
import java.io.*;
import pieces.ChessPiece;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import static pieces.King.castledK;
import static pieces.King.castledQ;


public class Chess {
	public static Board chessBoard;
	static boolean whiteTurn = true;

	public static void main(String[] args) {
		setUpGame();
		Scanner sc = new Scanner(System.in);
		String input = "";

		//TODO Check for checkmate or stalemate
		while (true) { //while not checkmate
			if (whiteTurn) {
				System.out.println();
				System.out.print("White's move: ");
			}
			else {
				System.out.println();
				System.out.print("Black's move: ");
			}
			input = sc.nextLine();
			newBoardState(input);
		}
		
	}
	public static void setUpGame() {
		chessBoard = new Board();
		chessBoard.drawBoard();
	}
	//TODO Capturing & board updates **DONE**
	//TODO weird board update bug due to piece naming **DONE**
	public static void newBoardState(String input) {
		String[] tokens = input.trim().toLowerCase().split("\\s+");
		if (tokens.length == 0 || tokens.length > 2) {
			System.out.println("Illegal move, try again");
			if (whiteTurn) {
				System.out.println("White's move: ");
			}
			else {
				System.out.println("Black's move: ");
			}	
		}
		else if (tokens.length == 1) {
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
		else { //correct inputs
			//move tokens[0] to tokens[1] if a valid move
			int xfrom = Math.abs('a'-tokens[0].charAt(0));
			int yfrom = Math.abs(8-Character.getNumericValue(tokens[0].charAt(1)));
			int xto = Math.abs('a'-tokens[1].charAt(0));
			int yto = Math.abs(8-Character.getNumericValue(tokens[1].charAt(1)));
			int currColor = whiteTurn ? 0 : 1;
			Spot currSpot = chessBoard.grid[xfrom][yfrom];
			Spot destSpot = chessBoard.grid[xto][yto];

			if (currSpot.isEmpty()){
				System.out.println("Illegal move, try again (current spot is empty)");
			}else if(currSpot.getPiece().getColor() == currColor && currSpot.getPiece().validMove(chessBoard, currSpot, destSpot)){ //valid move
				//CASTLING
				if (castledK){
					if (whiteTurn){
						//move rook only as king moving is handled below
						chessBoard.grid[5][7].setPiece(chessBoard.grid[7][7].getPiece());
						chessBoard.grid[7][7].setPiece(null);
					}else{
						chessBoard.grid[5][0].setPiece(chessBoard.grid[7][0].getPiece());
						chessBoard.grid[7][0].setPiece(null);
					}
					castledK = false;
				}
				if (castledQ){
					if (whiteTurn){
						//same thing move rook only
						chessBoard.grid[3][7].setPiece(chessBoard.grid[0][7].getPiece());
						chessBoard.grid[0][7].setPiece(null);
					}else{
						chessBoard.grid[3][0].setPiece(chessBoard.grid[0][0].getPiece());
						chessBoard.grid[0][0].setPiece(null);
					}
					castledQ = false;
				}
				//remove piece from old Spot
				System.out.println("selected piece and color: " + currSpot.getPiece().getPieceName() + " " + currSpot.getPiece().getColor());
				ChessPiece mover = currSpot.getPiece();
				currSpot.setPiece(null);

				//check new Spot for enemy Piece, if so then remove
				if (destSpot.getPiece() != null){
					destSpot.piece.Dead();
					System.out.println("\nBAM! " + destSpot.getPiece().getPieceName() + " was captured by " + mover.getPieceName() + " @ (" + xto + ", " + yto +")");
				}
				destSpot.setPiece(mover);
				chessBoard.drawBoard();
				whiteTurn = whiteTurn ? false : true; //switch colors
			}else {
				System.out.println("selected piece and color: " + currSpot.getPiece().getPieceName() + " " + currSpot.getPiece().getColor());
				System.out.println("Illegal move, try again (illegal move)");
			}

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
