package patterns.singleton.assignment;

public class TestLoggerUtil {
    public static void main (String[] args) {
        Logger logger = Logger.getInstance ();
        logger.log ("This is a test string");
    }
}
