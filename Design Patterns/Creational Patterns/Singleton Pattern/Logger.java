public class Logger {
    // Private static variable to hold the single instance of the Logger
    private static Logger instance;

    // Private constructor to prevent direct instantiation from outside
    private Logger() {
    }

    // Public method to provide access to the Logger instance
    public static Logger getInstance() {
        // Lazy initialization: create the instance only when it's first accessed
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log method to print the log messages
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}