package chess.moves;

import java.util.List;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;
import chess.conditions.MoveBaseCondition;
import chess.conditions.PieceCellOccupyBlocker;
import chess.conditions.PieceMoveFurtherCondition;
import chess.player.Player;

public class DiagonalMoveDirection extends BasicMovesClass{

	public DiagonalMoveDirection(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
		
	}

	@Override
	protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board,
			List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	
	   

		
}
