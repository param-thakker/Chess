package chess;
import pieces.ChessPiece;

public class Spot {
	int x;
	int y;
	ChessPiece piece;
	
	
	public Spot(int x, int y, ChessPiece piece) {
		this.x = x;
		this.y = y;
		this.piece = piece;
		
	}
    public ChessPiece getPiece() 

    { 
        return this.piece; 
    } 
    public void setPiece(ChessPiece p) 

    { 
        this.piece = p; 
    } 


    public int getXCoordinate() 

    { 
        return this.x; 
    } 

    public void setXCoordinate(int x) 

    { 
        this.x = x; 
    } 

    public int getYCoordinate() 

    { 
        return this.y; 
    } 

    public void setYCoordinate(int y) 

    { 
        this.y = y; 
    }

}
