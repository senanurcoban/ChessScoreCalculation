package chess.conditions;

import chess.board.Piece;

// Bir parçanın hareket etmesi için temel koşulu sağlar. 
//Parçanın mevcut konumundan hareket etmesine ancak koşul yerine getirilirse izin verilir.
public interface MoveBaseCondition {

	boolean isBaseConditionFullfilled(Piece piece);
}
