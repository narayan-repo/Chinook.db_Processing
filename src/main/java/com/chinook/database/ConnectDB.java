package com.chinook.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection connect() throws SQLException {

        String dbURL = "jdbc:sqlite:src/data/chinook.db";
        Connection connection = DriverManager.getConnection(dbURL);

        System.out.println("Connection to db established.");

        return connection;
    }
}
