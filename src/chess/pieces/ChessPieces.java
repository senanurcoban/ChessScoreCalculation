package chess.pieces;


import chess.board.Board;
import chess.board.Piece;

public abstract class ChessPieces extends Piece{

	
	private Color color;
	private int moveCount;
	
	public ChessPieces(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// Get metotları
	public Color getColor() {
		return color;
	}


	public int getMoveCount() {
		return moveCount;
	}

	// Satranç taşlarının hareket artışı için
	public void increaseMoveCount() {
		moveCount++;
	}
	
	// Satranç taşlarının hareket azalışı için
	public void decreaseMoveCount() {
		moveCount--;
	}
	

}
