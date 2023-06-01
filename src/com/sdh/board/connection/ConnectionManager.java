package com.sdh.board.connection;

import java.sql.*;

public class ConnectionManager {

    private static final String db_url = "jdbc:mariadb://localhost:3306/test";
    private static final String db_user = "root";
    private static final String db_password = "1234";

    public Connection getConnection()throws SQLException {

        return DriverManager.getConnection(db_url,db_user,db_password);

    }
}
