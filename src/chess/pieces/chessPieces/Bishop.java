package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

public class Bishop extends ChessPieces{

	public Bishop(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "f";
	}
}
