package chess.board;


// Bir satranç oyunu tahtası için model sınıfı. 
// Bir panonun bir boyutu ve ızgarası vardır.

public class Board {

	int boardSize;          // 8*8 lik ebat
    Cell[][] cells;        // Kare şeklinde toplam 64 adet hücre

    // Constructor metodu
    public Board(int boardSize, Cell[][] cells) {
        this.boardSize = boardSize;
        this.cells = cells;
    }

    // Hücreyi geçerli hücrenin soluna döndürmek için 
    public Cell getLeftCell(Cell cell) {
        return getCellAtLocation(cell.getX(), cell.getY() - 1);
    }

    // Hücreyi geçerli hücrenin sağına döndürmek için 
    public Cell getRightCell(Cell cell) {
        return getCellAtLocation(cell.getX(), cell.getY() + 1);
    }


   // Hücreyi geçerli hücrenin aşağısına döndürmek için 
    public Cell getDownCell(Cell cell) {
        return getCellAtLocation(cell.getX() - 1, cell.getY());
    }

    // Belirli bir konumdaki hücreyi döndürmek için 
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
