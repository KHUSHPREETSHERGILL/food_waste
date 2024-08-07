package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * A utility class for managing database connections.
 * This class provides methods to obtain and close database connections, 
 * ensuring efficient resource management.
 * 
 * @author Chiranjeev Singh , Khushpreet Kaur 
 */
public class DBUtil {
    private static Connection conn;

    /**
     * Default constructor.
     */
    public DBUtil() {
    }

    /**
     * Provides a database connection.
     * This method checks if the connection is null or closed, and if so, 
     * initializes a new connection using the database configuration.
     * 
     * @return A Connection object to the database.
     */
    public static Connection provideConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                ResourceBundle rb = ResourceBundle.getBundle("application");
                String connectionString = "jdbc:mysql://localhost:3306/fwrp0";
                String driverName = "com.mysql.cj.jdbc.Driver";
                String username = "root";
                String password = "03122002";
                try {
                    Class.forName(driverName);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                conn = DriverManager.getConnection(connectionString, username, password);
                System.out.println("Connected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * Closes the given Connection.
     * 
     * @param con The Connection object to be closed.
     */
    public static void closeConnection(Connection con) {
        /*
         * try { if (con != null && !con.isClosed()) {
         * 
         * con.close(); } } catch (SQLException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); }
         */
    }

    /**
     * Closes the given ResultSet.
     * 
     * @param rs The ResultSet object to be closed.
     */
    public static void closeConnection(ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Closes the given PreparedStatement.
     * 
     * @param ps The PreparedStatement object to be closed.
     */
    public static void closeConnection(PreparedStatement ps) {
        try {
            if (ps != null && !ps.isClosed()) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
