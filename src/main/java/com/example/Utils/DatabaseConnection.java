package com.example.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection initializeConnection() throws ClassNotFoundException, SQLException {
        //Driver and URL
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql:// localhost:3306/";
        //Db credentials
        String userName = "root";
        String password = "411353";
        String dbName = "usercrud";

        Class.forName(dbDriver);
        Connection conn = DriverManager.getConnection(dbUrl + dbName, userName, password);

        return conn;
    }
}
