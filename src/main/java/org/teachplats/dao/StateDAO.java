package org.teachplats.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.teachplats.model.State;

import java.sql.*;

public class StateDAO  extends BaseDAO<State> implements IStateDAO{

    private final static Logger logger = LogManager.getLogger(StateDAO.class);
    private Connection connection;
    private final static String INSERT = "INSERT INTO States (NAME, COUNTRY_ID ) VALUES (?, ?)";

    public StateDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(State state)  {
        try (PreparedStatement pstm = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, state.getName());
            pstm.setLong(2, state.getCountryId());
            pstm.execute();
            try (ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()) {
                    state.setId(rst.getLong(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        logger.info(state);
    }

    @Override
    public State getById(Long id) throws Exception {
        return null;
    }

    @Override
    public void removeById(Long id) throws SQLException {

    }

    @Override
    public void updateState(String name, Long id, Long countryId) {

    }
}
