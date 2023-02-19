package utils;
import java.sql.*;

import java.sql.DriverManager;

public class ConnectionJDBC {


    private static final String url = "jdbc:postgresql://localhost/dvdrental";
    private static final String user = "postgres";
    private static final String password = "1892";

    public static Connection connection = null;
    private static final String databaseName = "dvdrental";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return conn;
    }

    /**
     * public static Connection openConnection()
     * {
     * try {
     * Class.forName(driver); // Locate Driver
     * connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object
     * <p>
     * <p>
     * }
     * <p>
     * catch(Exception e)
     * {
     * System.out.println("Error:" + e.getMessage());
     * }
     * return connection;
     * }
     */
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}

