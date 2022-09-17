package com.chinook.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static void connect(){
        Connection conn = null;
        try {
            String dbURL = "jdbc:sqlite:src/data/chinook.db";
            conn = DriverManager.getConnection(dbURL);
            System.out.println("Connection to db established.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
