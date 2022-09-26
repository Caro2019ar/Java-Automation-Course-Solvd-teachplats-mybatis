package org.teachplats.connection.DBCP2;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        ConnectionDBCP2Test conn = new ConnectionDBCP2Test();
        Connection connection = conn.getConnection();
        conn.closeConnection(connection);

    }
}
