package chess.board;

import java.util.List;

import chess.conditions.PieceCellOccupyBlocker;
import chess.player.Player;

// Bir satranç tahtası oyunu için model sınıfı. 
// Bir panonun bir boyutu ve bir hücre ızgarası vardır.

public class Board {

	int boardSize;
    Cell[][] cells;

    // Constructor metodu
    public Board(int boardSize, Cell[][] cells) {
        this.boardSize = boardSize;
        this.cells = cells;
    }

    // Hücreyi geçerli hücrenin soluna döndürmek için yardımcı yöntem.
    public Cell getLeftCell(Cell cell) {
        return getCellAtLocation(cell.getX(), cell.getY() - 1);
    }

    // Hücreyi geçerli hücrenin sağına döndürmek için yardımcı yöntem.
    public Cell getRightCell(Cell cell) {
        return getCellAtLocation(cell.getX(), cell.getY() + 1);
    }

    // Hücreyi geçerli hücrenin başına döndürmek için yardımcı yöntem.
    public Cell getUpCell(Cell cell) {
        return getCellAtLocation(cell.getX() + 1, cell.getY());
    }

   // Hücreyi geçerli hücrenin aşağısına döndürmek için yardımcı yöntem
    public Cell getDownCell(Cell cell) {
        return getCellAtLocation(cell.getX() - 1, cell.getY());
    }

    // Belirli bir konumdaki hücreyi döndürmek için yardımcı yöntem.
    public Cell getCellAtLocation(int x, int y) {
        if (x >= boardSize || x < 0) {
            return null;
        }
        if (y >= boardSize || y < 0) {
            return null;
        }

        return cells[x][y];
    }

    // Oyuncunun mevcut tahtada kontrolde olup olmadığını belirlemek için yardımcı yöntem
    public boolean isPlayerOnCheck(Player player) {
        return checkIfPieceCanBeKilled(player.getPiece(PieceType.KING), kingCheckEvaluationBlockers(), player);
    }

    /**
     *Taşın mevcut tahta konfigürasyonuna göre şu anda rakip tarafından öldürülüp öldürülemeyeceğini kontrol etme yöntemi.
     *
     * @param targetPiece        Piece which is to be checked.
     * @param cellOccupyBlockers Blockers which make cell non occupiable.
     * @param player             Player whose piece has to be checked.
     * @return Boolean indicating whether the piece is in danger or not.
     */
    public boolean checkIfPieceCanBeKilled(Piece targetPiece, List<PieceCellOccupyBlocker> cellOccupyBlockers, Player player) {
        for (int i = 0; i < getBoardSize(); i++) {
            for (int j = 0; j < getBoardSize(); j++) {
                Piece currentPiece = getCellAtLocation(i, j).getCurrentPiece();
                if (currentPiece != null && !currentPiece.isPieceFromSamePlayer(targetPiece)) {
                    List<Cell> nextPossibleCells = currentPiece.nextPossibleCells(this, cellOccupyBlockers, player);
                    if (nextPossibleCells.contains(targetPiece.getCurrentCell())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	

	
	
	
}
