package chess.pieces.chessPieces;

import chess.board.Board;
import chess.pieces.ChessPieces;
import chess.pieces.Color;

// Bishop(fil) sınıfı
public class Bishop extends ChessPieces{

	
	
	public Bishop(Board board, Color color) {
		super(board, color);
		
	}

	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "f";
	}
}
