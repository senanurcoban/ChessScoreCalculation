package chess.conditions;

import chess.board.Piece;

// Bir parçanın hareket etmesi için temel koşulu sağlar. 
// Parçanın mevcut konumundan hareket etmesine ancak koşul yerine getirilirse izin verilir.
// İnterface içerisinde, public metotlar olur ve sadece metot imzasını barındırırlar.
public interface MoveBaseCondition {

	public boolean isBaseConditionFull(Piece piece);
}
