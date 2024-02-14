package project.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DataSourceTest extends DataSource{

    private static DataSourceTest dataSource;
    protected DataSourceTest() throws ClassNotFoundException {
        super();
    }

    protected Connection getCloneConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Bank_test",
                "root",
                "root");
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (dataSource == null) {
            dataSource = new DataSourceTest();
        }
        return dataSource.getCloneConnection();
    }
}