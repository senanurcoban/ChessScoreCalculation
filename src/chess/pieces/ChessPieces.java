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

	public Color getColor() {
		return color;
	}


	public int getMoveCount() {
		return moveCount;
	}

	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	

}
