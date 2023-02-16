package chess.moves;


import java.util.List;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;
import chess.conditions.MoveBaseCondition;
import chess.conditions.PieceCellOccupyBlocker;
import chess.conditions.PieceMoveFurtherCondition;
import chess.player.Player;

//Belirli bir hareket türü için oluşturulan temel soyut sınıf. 
//Örneğin, yatay hareket türü ile yalnızca yatay hareketler yapan hücreleri verecektir.
public abstract class BasicMovesClass {

	int maxSteps;                                       // max ilerleyebilecek adımlar
    MoveBaseCondition baseCondition;                   //  Dependency Injection
    PieceMoveFurtherCondition moveFurtherCondition;   //   Dependency Injection
    PieceCellOccupyBlocker baseBlocker;              //    Dependency Injection

    // Parametreli Constructor metodu
    public BasicMovesClass(int maxSteps, MoveBaseCondition baseCondition, PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        this.maxSteps = maxSteps;
        this.baseCondition = baseCondition;
        this.moveFurtherCondition = moveFurtherCondition;
        this.baseBlocker = baseBlocker;
    }

    // Geçerli hareket türüyle ulaşılabilecek tüm olası hücreleri veren 
    public List<Cell> possibleMoves(Piece piece, Board inBoard, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        if (baseCondition.isBaseConditionFull(piece)) {
            return MovesAsPerCurrentType(piece, inBoard, additionalBlockers, player);
        }
        return null;
    }

    //Davranışlarına göre, olası hareketleri vermek için her hareket türü tarafından uygulanması gereken 
    protected abstract List<Cell>MovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player);

    

    
    // Belirli bir hücrenin, parça tarafından işgal edilip edilemeyeceğini kontrol eden
     
    private boolean checkIfCellCanBeOccupied(Piece piece, Cell cell, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        if (baseBlocker != null && baseBlocker.CellNonOccupiablePiece(cell, piece, board, player)) {
            return false;
        }
        for (PieceCellOccupyBlocker cellOccupyBlocker : additionalBlockers) {
            if (cellOccupyBlocker.CellNonOccupiablePiece(cell, piece, board, player)) {
                return false;
            }
        }
        return true;
    }
}
