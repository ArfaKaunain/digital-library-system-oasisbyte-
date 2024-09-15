/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arfa kaunain
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class javaconnect {
    public static Connection ConnectDb() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/librarysystem_db?zeroDateTimeBehavior=CONVERT_TO_NULL",
                "root",
                "arfa51846"
            );

            return con;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        }
        return null;
    }
}



