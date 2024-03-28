package logger;

public class MainDriver {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(LogType.INFO, "Info log");
        logger.log(LogType.ERROR, "Error log");
    }
}
