package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

public class King extends ChessPieces{

	public King(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "s";
	}
	
}
