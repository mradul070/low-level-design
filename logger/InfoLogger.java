package logger;

public class InfoLogger extends Logger {
    InfoLogger(Logger hasNextLogger) {
        super(hasNextLogger);
    }
    @Override
    public void log(LogType logType, String message) {
        if (logType == LogType.INFO) {
            System.out.println(message);
        } else {
            super.log(logType, message);
        }
    }
}
