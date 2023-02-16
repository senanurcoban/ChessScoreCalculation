package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

// Rook(kale) sınıfı
public class Rook extends ChessPieces{

	
	public Rook(Board board, Color color) {
		super(board, color);
		
	}

	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "k";
	}
}
