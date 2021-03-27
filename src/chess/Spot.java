package chess;
import pieces.ChessPiece;

/**
 * Spot is the class which gives information about any particular square on the chessboard.
 * @author Param Thakker
 * @author Jonathan Lu
 *
 */
public class Spot {
	int x;
	int y;
	ChessPiece piece;
	
	
	public Spot(int x, int y, ChessPiece piece) {
		this.x = x;
		this.y = y;
		this.piece = piece;
		
	}
	/**
	 * getPiece method is used to get the Piece at a particular spot
	 * @return  The chesspiece at that spot
	 */
    public ChessPiece getPiece() 

    { 
        return this.piece; 
    } 
    /**
     * setPiece method is used to set a chesspiece to a particular spot
     * @param p   The chessPiece to be placed
     */
    public void setPiece(ChessPiece p) 

    { 
        this.piece = p; 
    } 

    public boolean isEmpty() { return piece == null;}

    /**
     * getXCoordinate method is used to get x coordinate of a particular spot
     * @return The x coordinate of the spot
     */
    public int getXCoordinate() 

    { 
        return this.x; 
    } 
    

    public void setXCoordinate(int x) 

    { 
        this.x = x; 
    } 

    /**
     * getYCoordinate method is used to get y coordinate of a particular spot
     * @return  The y coordinate of the spot
     */
    public int getYCoordinate() 

    { 
        return this.y; 
    } 

    public void setYCoordinate(int y) 

    { 
        this.y = y; 
    }

}
