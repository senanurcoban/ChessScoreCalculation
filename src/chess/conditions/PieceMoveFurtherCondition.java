package chess.conditions;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;

// Bir parçanın bir hücreden daha fazla hareket edip edemeyeceğini söylemek için ara yüz oluşturuldu.
public interface PieceMoveFurtherCondition {

	  boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board);
}
