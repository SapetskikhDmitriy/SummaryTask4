package ua.nure.sapetskykh.SummaryTask4.exception;
/**
 * An exception that provides information on an application error.
 *
 *
 */
public class AppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4061060965275172050L;

	public AppException() {
        super();
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }
}
