package org.teachplats;

import org.teachplats.connection.ConnectionDBCP2;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionDBCP2 conn = new ConnectionDBCP2();
        Connection connection = conn.getConnection();
        conn.closeConnection(connection);
    }
}