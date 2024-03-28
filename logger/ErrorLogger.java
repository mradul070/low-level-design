package logger;

public class ErrorLogger extends Logger{
    ErrorLogger(Logger hasLogger) {
        super(hasLogger);
    }
    @Override
    public void log(LogType logType, String message) {
        if (logType == LogType.ERROR) {
            System.out.println(message);
        }
        else {
            super.log(logType, message);
        }
    }
}
