package chess.conditions;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;
import chess.player.Player;

//Bu kontrol, bir taşın tahtadaki belirli bir hücreyi işgal edip edemeyeceğini söyler.
public interface PieceCellOccupyBlocker {

	 boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player);
}
