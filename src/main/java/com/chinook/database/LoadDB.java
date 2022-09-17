package com.chinook.database;

import com.chinook.entity.Genre;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoadDB {

    public static List<Genre> loadGenres() throws SQLException {
        List<Genre> genres = new ArrayList<>();
        Connection conn = ConnectDB.connect();

        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("select genreid, name from genres");
        while(res.next()) {
            int genreId = res.getInt("genreId");
            String name = res.getString("name");
            Genre genre = new Genre(genreId, name);
            genres.add(genre);
        }
        conn.close();
        return genres;
    }
}
