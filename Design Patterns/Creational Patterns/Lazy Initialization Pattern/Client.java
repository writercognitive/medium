public class Client {
    public static void main(String[] args) {
        // Database connection is not created yet
        System.out.println("Application started...");

        // Get the DatabaseConnection instance (lazy initialization, connection is established now)
        DatabaseConnection connection = DatabaseConnection.getInstance();

        // Other application code that uses the database connection...

        // Database connection is not recreated, as the instance is already created
        DatabaseConnection anotherConnection = DatabaseConnection.getInstance();

        // More application code...

        // Closing the database connection (not shown in this example)
    }
}