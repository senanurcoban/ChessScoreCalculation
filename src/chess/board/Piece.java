package chess.board;

import java.util.List;

import chess.moves.BasicMovesClass;
import chess.pieces.Color;

// Satranç tahtasında bulunan taşlar için bir soyut sınıf oluşturuldu.
public abstract class Piece {

	    private boolean isKilled = false;                        // Taşların birbirini götürme durumu için bir boolean değişken tanımlandı.              
	    private final Color color;                              // Taş renkleri sabit siyah ve beyaz olduğu için final bir değişken olarak tanımlandı.
	    protected final List<BasicMovesClass> movesProviders;  // Taşların oyun sırasında birden fazla hareketleri olduğu için liste şeklinde değerler tutuldu.
	    private Integer numMoves = 0;                          
	    PieceType pieceType;                                 // 6 adet taş tipi bulunmaktadır. Oluşturulan enum sınıfından bir nesne oluşturuldu.
	    private Cell currentCell;                           // Tahtada bulunan hücre sınıfından bir değişken oluşturuldu.

	    // Parametreli Constructor metodu
	    public Piece(final Color color, final List<BasicMovesClass> movesProviders,  final PieceType pieceType) {
	        this.color = color;
	        this.movesProviders = movesProviders;
	        this.pieceType = pieceType;
	    }

        // Constructor metodu
		public Piece(Board board) {
			this.color = null;
			this.movesProviders = null;
			
		}

      // GET metodları --->  Geri dönüşü olan metotlar ve isimlendirilmesi ise get ile başlayıp sonra değişken ismi yazılmalıdır. 
		
		
		public PieceType getPieceType() {
			return pieceType;
		}

		public Color getColor() {
			return color;
		}
		

	    public boolean isKilled() {
			return isKilled;
		}

		public Integer getNumMoves() {
			return numMoves;
		}

		public Cell getCurrentCell() {
			return currentCell;
		}

		public List<BasicMovesClass> getMovesProviders() {
			return movesProviders;
		}


		// İki parçanın aynı oyuncuya ait olup olmadığını kontrol etmek için 
	    public boolean isPieceFromSamePlayer(Piece piece) {
	        return piece.getColor().equals(this.color);
	    }
}
