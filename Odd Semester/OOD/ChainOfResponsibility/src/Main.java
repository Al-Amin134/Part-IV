//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static AbstractLogger getChainLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(console);
        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger logger = getChainLogger();
        logger.logMessage(AbstractLogger.INFO,"This is information");
        logger.logMessage(AbstractLogger.DEBUG, "This is debug message");
        logger.logMessage(AbstractLogger.ERROR, "This is error message");
    }
}