import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    public static void main(String[] args) {

        // Database connection details (replace with your info)
        String dbDriver = "com.mysql.cj.jdbc.Driver"; // Replace for other databases
        String url = "jdbc:mysql://localhost:3306/myDatabase";
        String username = "root";
        String password = "";

        try {
            // Load the JDBC driver
            Class.forName(dbDriver);

            // Attempt to connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Print success message if connection is established
            System.out.println("Connection established successfully!");

            // Close the connection (optional for testing, but important in practice)
            connection.close();  

        } catch (ClassNotFoundException e) {
            System.out.println("Error: JDBC driver not found: " + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}