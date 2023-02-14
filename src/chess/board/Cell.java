package chess.board;


// Bir satranç tahtasının tek hücresini temsil eden sınıf. 
// Bir hücre tahtada x ve y konumuyla temsil edilir.
public class Cell {

	    private int x;
	    private int y;

	    public Cell(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

	    private Piece currentPiece;
	    
	    public boolean isFree() {
	        return currentPiece == null;
	    }
}
