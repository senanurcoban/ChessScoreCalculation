package chess.board;

import java.util.ArrayList;
import java.util.List;

import chess.conditions.PieceCellOccupyBlocker;
import chess.exceptions.InvalidMoveException;
import chess.moves.BasicMovesClass;
import chess.pieces.Color;
import chess.player.Player;

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

	    public void killIt() {
	        this.isKilled = true;
	    }

	   // Parçayı geçerli hücreden belirli bir hücreye taşıma yöntemi.
	    public void move(Player player, Cell toCell, Board board, List<PieceCellOccupyBlocker> additionalBlockers) {
	        if (isKilled) {
	            throw new InvalidMoveException("Invalidd");
	        }
	        List<Cell> nextPossibleCells = nextPossibleCells(board, additionalBlockers, player);
	        if (!nextPossibleCells.contains(toCell)) {
	            throw new InvalidMoveException("Invalid not found");
	        }

	        killPieceInCell(toCell);
	        this.currentCell.setCurrentPiece(null);
	        this.currentCell = toCell;
	        this.currentCell.setCurrentPiece(this);
	        this.numMoves++;
	    }

	    // Belirli bir hücrede bir parçayı öldürmek için yardımcı yöntem.
	    private void killPieceInCell(Cell targetCell) {
	        if (targetCell.getCurrentPiece() != null) {
	            targetCell.getCurrentPiece().killIt();
	        }
	    }

	    /**
	     * Mevcut parçanın mevcut hücreden hareket edebileceği bir sonraki olası hücrelerin ne olduğunu söyleyen yöntem.
	     *
	     * @param board              Board on which the piece is present.
	     * @param additionalBlockers Blockers which make a cell non-occupiable for a piece.
	     * @param player             Player who owns the piece.
	     * @return List of all next possible cells.
	     */
	    public List<Cell> nextPossibleCells(Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
	        List<Cell> result = new ArrayList<>();
	        for (BasicMovesClass movesProvider : this.movesProviders) {
	            List<Cell> cells = movesProvider.possibleMoves(this, board, additionalBlockers, player);
	            if (cells != null) {
	                result.addAll(cells);
	            }
	        }
	        return removeDuplicates(result);
	    }

	    // İki parçanın aynı oyuncuya ait olup olmadığını kontrol etmek için yardımcı yöntem.
	    public boolean isPieceFromSamePlayer(Piece piece) {
	        return piece.getColor().equals(this.color);
	    }
}
