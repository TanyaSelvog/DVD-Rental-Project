package utils;
import java.sql.*;

import java.sql.DriverManager;

public class ConnectionJDBC {


    private static final String protocol = "jdbc";

 private static final String vendor = ":postgresql";
 private static final String location = "//localhost/";

 private final String url = "jdbc:postgresql://localhost/dvdrental";
 private final String user = "postgres";
 private final String password = "1892



    private static final String databaseName = "dvdrental";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone=SERVER"; // LOCAL


    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // Username
   // private static String password = "Passw0rd!"; // Password

    public static Connection connection = null;


    public static Connection openConnection()
    {
        try {
            Class.forName(driver); // Locate Driver
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object


        }

        catch(Exception e)
        {
            System.out.println("Error:" + e.getMessage());
        }
        return connection;
    }


    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e.getMessage());
        }
    }

}
}

