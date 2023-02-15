package chess.moves;


import java.util.List;

import chess.board.Board;
import chess.board.Cell;
import chess.board.Piece;
import chess.conditions.MoveBaseCondition;
import chess.conditions.PieceCellOccupyBlocker;
import chess.conditions.PieceMoveFurtherCondition;
import chess.player.Player;

//Belirli bir hareket türü için tüm olası hücreleri döndüren sağlayıcı sınıfı. 
//Örneğin, yatay hareket türü, yalnızca yatay hareketler yaparak ulaşılabilen tüm hücreleri verecektir.
public abstract class BasicMovesClass {

	int maxSteps;
    MoveBaseCondition baseCondition;
    PieceMoveFurtherCondition moveFurtherCondition;
    PieceCellOccupyBlocker baseBlocker;

    public BasicMovesClass(int maxSteps, MoveBaseCondition baseCondition, PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        this.maxSteps = maxSteps;
        this.baseCondition = baseCondition;
        this.moveFurtherCondition = moveFurtherCondition;
        this.baseBlocker = baseBlocker;
    }

    // Geçerli hareket türüyle ulaşılabilecek tüm olası hücreleri gerçekten veren genel yöntem
    public List<Cell> possibleMoves(Piece piece, Board inBoard, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        if (baseCondition.isBaseConditionFullfilled(piece)) {
            return possibleMovesAsPerCurrentType(piece, inBoard, additionalBlockers, player);
        }
        return null;
    }

    //Davranışlarına göre olası hareketleri vermek için her hareket türü tarafından uygulanması gereken soyut yöntem
    protected abstract List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player);

    

    
    // Belirli bir hücrenin parça tarafından işgal edilip edilemeyeceğini kontrol eden yardımcı yöntem. listesinden yararlanır
     
    private boolean checkIfCellCanBeOccupied(Piece piece, Cell cell, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        if (baseBlocker != null && baseBlocker.isCellNonOccupiableForPiece(cell, piece, board, player)) {
            return false;
        }
        for (PieceCellOccupyBlocker cellOccupyBlocker : additionalBlockers) {
            if (cellOccupyBlocker.isCellNonOccupiableForPiece(cell, piece, board, player)) {
                return false;
            }
        }
        return true;
    }
}
