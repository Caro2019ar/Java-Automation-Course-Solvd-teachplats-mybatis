package org.teachplats.connection;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.teachplats.connection.mysql_jdbc.AbstractMySqlJDBC;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDBCP2 extends AbstractMySqlJDBC {
    private final static Logger logger = LogManager.getLogger(ConnectionDBCP2.class);
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
            logger.info("Database connected");
            //System.out.println("Connected");
            return this.getInstance().getConnection();
        } catch (SQLException e) {
           throw new RuntimeException("Database could not connect. ");
        }
    }

    public void closeConnection(Connection connection) throws SQLException {
        logger.info("Close connection");
        connection.close();
    }
}
