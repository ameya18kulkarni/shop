package shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";  // Replace with your DB name
    private static final String USER = "root";  // Replace with your DB username
    private static final String PASSWORD = "123456";  // Replace with your DB password

    // Connection object
    private static Connection connection;

    // Method to establish the connection
    public static Connection connect() {
        try {
            // Establish the connection (no need for Class.forName() in modern JDBC versions)
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the MySQL database successfully.");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return connection;
    }

    // Method to close the connection
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection.");
            e.printStackTrace();
        }
    }

    // Main method to test the connection
    public static void main(String[] args) {
        // Connect to the database
        Connection conn = connect();

        // Close the connection
        closeConnection();
    }
}