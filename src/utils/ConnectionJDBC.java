package utils;

import java.sql.DriverManager;

public class ConnectionJDBC {
}

/**
    /**
     * Protocol

    private static final String protocol = "jdbc";
    /**
     * Database vendor

    private static final String vendor = ":mysql:";
    private static final String location = "//localhost/";
    /**
     * Name of database

    private static final String databaseName = "client_schedule";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone=SERVER"; // LOCAL
    /**
     * Driver reference

    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // Username
    private static String password = "Passw0rd!"; // Password
    /**
     * Connection interface

    public static Connection connection = null;

    /**
     * Starts the database connection
     * @return DB connection

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

    /**
     * Closes database connection

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
