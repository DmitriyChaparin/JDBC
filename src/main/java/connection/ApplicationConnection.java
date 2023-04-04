package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationConnection {

    private Connection getConnection() throws SQLException {
        final String URL = "jdbc:postgresql://localhost:5432/skypro";
        final String user = "postgres";
        final String password = "796960";
        return DriverManager.getConnection(URL, user, password);
    }
public  PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
}
}
