package chess.moves;

import chess.conditions.MoveBaseCondition;
import chess.conditions.PieceCellOccupyBlocker;
import chess.conditions.PieceMoveFurtherCondition;

public class HorizontalMoveDirection extends BasicMovesClass{

	public HorizontalMoveDirection(int maxSteps, MoveBaseCondition baseCondition,
            PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
           super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
}


}
