package com.chinook.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection connect(){
        String dbURL = "jdbc:sqlite:src/data/chinook.db";
        try (Connection conn = DriverManager.getConnection(dbURL)) {
            System.out.println("Connection to db established.");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
