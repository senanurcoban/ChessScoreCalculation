package chess.board;


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

   

   
	

	
	
	
}
