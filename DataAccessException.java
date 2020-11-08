package demo_jdbc.Exception;

public class DataAccessException  extends RuntimeException{
	private static final long serialVersionUID = -1622238743523291989L;

	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataAccessException(String message) {
		super(message);
	}
}