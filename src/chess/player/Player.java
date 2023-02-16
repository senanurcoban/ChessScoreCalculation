package chess.player;

import java.util.List;

import chess.board.Piece;
import chess.board.PieceType;
import chess.exceptions.PieceNotFoundException;

//Bir oyuncuyu temsil eden bu sınıf, soyut bir sınıf olmalı.
//Cünkü oyuncunun hamlesini nasıl yapacagından emin degiliz.
//Oyuncu yerel bir oyuncuysa, yerel olarak hareket edebilir. Ağ tabanlı bir oyuncu da olabilir.
//Yani oyuncunun tipine göre hamle yapabilir.
public abstract class Player {

	    List<Piece> pieces;                         // Oyuncunun birden fazla taşı olduğu için liste tipinde tutuldu.

	    // Constructor metodu
	    public Player(List<Piece> pieces) {
	        this.pieces = pieces;
	    }

	    //Get metodu
	    public List<Piece> getPieces() {
			return pieces;
		}

	    // Kullanıcıya hata mesajı gösterebilmek için
	    // For-each döngüsü ile liste içindeki elemanlar sadece okunabilir. 
		public Piece getPiece(PieceType pieceType) {
	        for (Piece piece : getPieces()) {
	            if (piece.getPieceType() == pieceType) {
	                return piece;
	            }
	        }
	        throw new PieceNotFoundException("Piece not found!");
	    }

	    
}
