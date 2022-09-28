package org.teachplats.dao;


import org.teachplats.connection.DBCP2.ConnectionDBCP2;
import org.teachplats.model.State;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Connection;

public class StateDAOTest {

    StateDAO stateDAO = new StateDAO();


    //@BeforeClass
    public void setUpBefore() {

    }

    @Test
    public void createTest() {
//       State state = new State("Buenos Aires", 2l);
//        stateDAO.create(state);
       // Assert.assertEquals(state.getName(),"Buenos Aires");
    }
}
