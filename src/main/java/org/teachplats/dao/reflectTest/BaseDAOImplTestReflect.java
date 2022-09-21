package org.teachplats.dao.reflectTest;

import org.teachplats.dao.IBaseDAO;

import java.sql.*;

public abstract class BaseDAOImplTestReflect<T> implements IBaseDAO<T> {

    private Connection connection;

    public BaseDAOImplTestReflect(Connection connection) {
        this.connection = connection;
    }


    public void create(Class<T> classe) {
        String sql = "INSERT INTO ? (NAME) VALUES (?)";
        try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, classe.getClass().toString());
            pstm.setString(2, classe.getName());
            pstm.execute();
            try (ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()) {
                    //classe.setId(rst.getLong(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(classe);


    }


}
