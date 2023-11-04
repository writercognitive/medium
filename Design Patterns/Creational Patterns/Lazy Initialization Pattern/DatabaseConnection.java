public class DatabaseConnection {
    // Private static instance to hold the single instance of DatabaseConnection
    private static DatabaseConnection instance;

    // Private constructor to prevent direct instantiation from outside
    private DatabaseConnection() {
        // Simulate expensive database connection setup
        System.out.println("Database connection established.");
    }

    // Public method to provide access to the DatabaseConnection instance
    public static synchronized DatabaseConnection getInstance() {
        // Lazy initialization: create the instance only when it's first accessed
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Other database-related methods...
}