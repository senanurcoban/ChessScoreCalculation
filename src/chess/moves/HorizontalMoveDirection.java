package chess.moves;

import java.util.ArrayList;
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
}

protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, final Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
List<Cell> result = new ArrayList<>();
result.addAll(findAllNextMoves(piece, board::getLeftCell, board, additionalBlockers, player));
result.addAll(findAllNextMoves(piece, board::getRightCell, board, additionalBlockers, player));
return result;
}
}
