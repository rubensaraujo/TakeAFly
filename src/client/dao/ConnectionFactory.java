package client.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javarmi", "root", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
