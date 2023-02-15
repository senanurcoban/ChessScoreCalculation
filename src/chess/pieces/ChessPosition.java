package chess.pieces;


import chess.exceptions.ChessException;

public class ChessPosition {

	private int column;
	private int row;
	
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiang ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}


	public int getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
