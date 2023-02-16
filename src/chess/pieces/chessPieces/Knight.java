package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

// Knight(at) sınıfı
public class Knight extends ChessPieces{

	
	public Knight(Board board, Color color) {
		super(board, color);
		
	}
	
	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "a";
	}
}
