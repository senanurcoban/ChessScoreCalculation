package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

// Pawn(piyon) sınıfı
public class Pawn extends ChessPieces{

	
	public Pawn(Board board, Color color) {
		super(board, color);
		
	}
	
	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "p";
	}
	
}
