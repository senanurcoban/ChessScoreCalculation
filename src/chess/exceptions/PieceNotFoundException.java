package chess.exceptions;

// Getirilecek parça yoksa hatası
public class PieceNotFoundException extends RuntimeException  {

	private static final long serialVersionUID = 1L;
	
	public PieceNotFoundException(String message) {
		super(message);
	}
}
