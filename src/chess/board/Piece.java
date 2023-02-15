package chess.board;

import java.util.List;

import chess.moves.BasicMovesClass;
import chess.pieces.Color;

public abstract class Piece {

	    private boolean isKilled = false;
	    private final Color color;
	    private final List<BasicMovesClass> movesProviders;
	    private Integer numMoves = 0;
	    PieceType pieceType;
	    private Cell currentCell;

	    public Piece( final Color color, final List<BasicMovesClass> movesProviders,  final PieceType pieceType) {
	        this.color = color;
	        this.movesProviders = movesProviders;
	        this.pieceType = pieceType;
	    }


		public PieceType getPieceType() {
			return pieceType;
		}

		public Color getColor() {
			return color;
		}

		public void killIt() {
	        this.isKilled = true;
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


		// İki parçanın aynı oyuncuya ait olup olmadığını kontrol etmek için yardımcı yöntem.
	    public boolean isPieceFromSamePlayer(Piece piece) {
	        return piece.getColor().equals(this.color);
	    }
}
