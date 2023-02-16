package chess.pieces;


import chess.exceptions.ChessException;


public class ChessPosition {

	private int column;
	private int row;
	
	
	// 8*8 boyuttan oluşan satranç tahtasının, dikey sütünu 1-8 sayıları ve yatay satırı A-H harflerinden oluşmakta.
	// Eğer satır&sütun değerleri bu değerler içerisinde olmazsa, kullanıcıya bir hata verilmesi planlandı.
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiang ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

    
	// Get metodları
	public int getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	// ToString() metodu ile --> nesnelerin metin karşılıklarını ekrana yazdırmak için kullanılır.
	@Override
	public String toString() {
		return "" + column + row;
	}
}
