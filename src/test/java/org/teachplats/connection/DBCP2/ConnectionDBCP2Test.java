package org.teachplats.connection.DBCP2;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDBCP2Test extends AbstractMySqlJDBCTest {
    private static BasicDataSource dataSource = null;

    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        dataSource.setMinIdle(1);
        dataSource.setMaxIdle(5);
        dataSource.setMaxTotal(7);

    }

    public static BasicDataSource getInstance() {
        if (dataSource == null) {
            synchronized (BasicDataSource.class) {
                if (dataSource == null) {
                    dataSource = new BasicDataSource();
                }
            }
        }
        return dataSource;
    }

    public Connection getConnection() {
        try {
            System.out.println("Connected");
            return this.getInstance().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection(Connection connection) throws SQLException {
        System.out.println("Close connection");
        connection.close();
    }
}
