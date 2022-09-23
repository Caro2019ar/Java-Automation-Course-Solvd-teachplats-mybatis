package org.teachplats.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.model.State;

import java.sql.*;

public class StateDAO extends BaseDAO<State> implements IStateDAO {

    private final static Logger logger = LogManager.getLogger(StateDAO.class);
    private Connection connection;
    private final static String INSERT = "INSERT INTO States (NAME, COUNTRY_ID ) VALUES (?, ?)";

    public StateDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(State state) {
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
