public class Client {
    public static void main(String[] args) {
        // Get the Logger instance
        Logger logger = Logger.getInstance();

        // Log messages
        logger.log("This is a log message.");
        logger.log("Another log message.");

        // The same instance is used throughout the application
        Logger logger2 = Logger.getInstance();
        System.out.println(logger == logger2); // Output: true
    }
}