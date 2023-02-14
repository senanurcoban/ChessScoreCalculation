package chess.exceptions;

// Bir oyuncunun bir taş için yaptığı hamle geçersiz olduğunda istisna.
public class InvalidMoveException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public InvalidMoveException(String message) {
		super(message);
	}
	
}
