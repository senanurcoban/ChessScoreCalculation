package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

// King(şah) sınıfı
public class King extends ChessPieces{

	
	
	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "s";
	}
	
}
