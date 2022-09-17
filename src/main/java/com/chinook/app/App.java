package com.chinook.app;

import com.chinook.database.LoadDB;
import com.chinook.entity.Genre;

import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws SQLException {
        List<Genre> genres = LoadDB.loadGenres();
        genres.forEach(m -> System.out.printf("%d\t:\t%s\n", m.getGenreId(),m.getName()));
    }
}
