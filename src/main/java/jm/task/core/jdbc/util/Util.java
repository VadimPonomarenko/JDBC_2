package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Z0Ym0STWV7XbW6L";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";


    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public static void closeCon(Connection con) throws SQLException {
        con.close();
    }

}
