package exceptions;

public class PlayerTooLowException extends Exception{

	
	private static final long serialVersionUID = 4733557070801499509L;
	
	public PlayerTooLowException(String message) {
		super(message);
	}
}
