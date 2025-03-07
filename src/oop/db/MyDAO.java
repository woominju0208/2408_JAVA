package oop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDAO {
    private final String DB_DRIVER_CLASS = "org.mariadb.jdbc.Driver";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "vuestagram";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "php504";
    private final String DB_URL = String.format("jdbc:mariadb://%s:%s/%s", DB_HOST, DB_PORT, DB_NAME);

    // 메소드 옆에 throws ~ 옆에 적어주면 따로 catch 안적어줘도 해당되면 catch해준다.
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // MariaDB 드라이버 클래스 로딩
        Class.forName(DB_DRIVER_CLASS);

        // DB Connection 객체 생성
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

}
