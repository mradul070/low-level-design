package logger;

public class DebugLogger extends Logger {
    DebugLogger(Logger logger) {
        super(logger);
    }
    @Override
    public void log(LogType logType, String message) {
        if (logType == LogType.DEBUG) {
            System.out.println(message);
        } else {
            super.log(logType, message);
        }
    }
}
