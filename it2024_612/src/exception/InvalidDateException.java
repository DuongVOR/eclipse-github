package exception;

public class InvalidDateException extends Exception {
	public InvalidDateException() {

	}

	public InvalidDateException(String s) {
		super(s);
	}

	public InvalidDateException(Exception e) {
		super(e);
	}
}
