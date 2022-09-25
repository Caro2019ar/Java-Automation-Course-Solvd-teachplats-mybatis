package org.teachplats.dao;


import org.teachplats.connection.DBCP2.ConnectionDBCP2;
import org.teachplats.model.State;
import org.testng.Assert;

import java.sql.Connection;

public class StateDAOTest {
    Connection connection = null;
    org.teachplats.dao.StateDAO stateDAO = null;

    State state = null;

    //@BeforeClass
    public void setUpBefore() {
        connection = new ConnectionDBCP2().getConnection();
        stateDAO = new org.teachplats.dao.StateDAO(connection);
    }

   // @Test
    public void createTest() {
        state = new State("Buenos Aires", 2l);
        stateDAO.create(state);
        Assert.assertEquals(state.getName(),"Buenos Aires");
    }
}
