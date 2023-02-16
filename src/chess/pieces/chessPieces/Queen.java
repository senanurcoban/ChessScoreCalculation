package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

// Queen(vezir) sınıfı
public class Queen extends ChessPieces{

	
	public Queen(Board board, Color color) {
		super(board, color);
		
	}

	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "v";
	}
}
