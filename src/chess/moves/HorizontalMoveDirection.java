package chess.moves;

import java.util.List;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;
import chess.conditions.MoveBaseCondition;
import chess.conditions.PieceCellOccupyBlocker;
import chess.conditions.PieceMoveFurtherCondition;
import chess.player.Player;

public class HorizontalMoveDirection extends BasicMovesClass{

	public HorizontalMoveDirection(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board,
			List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
