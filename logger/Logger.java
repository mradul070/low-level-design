package logger;

public class Logger {
    private Logger logger;
    Logger(Logger logger) {
        this.logger = logger;
    }
    public void log(LogType logType, String message) {
        if (logger != null) 
            logger.log(logType, message);
    }
}
