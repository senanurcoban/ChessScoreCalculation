package chess.moves;

import java.util.List;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;
import chess.conditions.MoveBaseCondition;
import chess.conditions.PieceCellOccupyBlocker;
import chess.conditions.PieceMoveFurtherCondition;
import chess.player.Player;

// Taşların çarpraz hareketini sağlamak için oluşturulan sınıf.
// Örneğin bishop(fil) taşı tahtada çapraz ilerlemektedir.
public class DiagonalMoveDirection extends BasicMovesClass{

	public DiagonalMoveDirection(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
		
	}

	// Metot içi işlevler eksik !
	@Override
	protected List<Cell> MovesAsPerCurrentType(Piece piece, Board board,
			List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	
	   

		
}
