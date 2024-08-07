/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A utility class to test the database connection and execute a sample query.
 * This class demonstrates how to use the DBUtil class to establish a connection
 * to the database, execute a query, and handle the results.
 * 
 * @author Chiranjeev Singh , Khushpreet Kaur 
 */
public class DBCONmain {
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Get a connection from DBUtil
            conn = DBUtil.provideConnection();
            if (conn != null) {
                System.out.println("Connected to database successfully!");

                // Example query to test the connection
                String sql = "SELECT * FROM users LIMIT 1"; 
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {
                    // If the query executed successfully
                    System.out.println("Sample query executed successfully!");
                } else {
                    System.out.println("No records found in the table.");
                }
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
