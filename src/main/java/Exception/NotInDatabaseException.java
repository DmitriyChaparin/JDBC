package Exception;

public class NotInDatabaseException extends RuntimeException {

    public NotInDatabaseException(String message) {
        super(message);
    }

}
