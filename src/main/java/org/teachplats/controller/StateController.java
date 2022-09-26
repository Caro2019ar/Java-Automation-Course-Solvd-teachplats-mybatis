package org.teachplats.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.dao.StateDAO;
import org.teachplats.model.State;
import org.teachplats.service.CountryServiceImp;
import org.teachplats.service.StateServiceImp;

import java.util.ArrayList;
import java.util.List;

public class StateController {
    private static StateServiceImp stateServiceImp = new StateServiceImp();
    private final static Logger logger = LogManager.getLogger(StateController.class);

    private static StateDAO stateDAO = new StateDAO();

    public static void main(String[] args) {

        //List<State> list = stateServiceImp.listAll();
        //list.forEach(logger::info);
        // System.out.println(stateDAO.getAll());
//       State state= new State("Chaco", 2l);
//       stateServiceImp.create(state);
       System.out.println("Controller" + stateServiceImp.searchById(2l));
       // stateServiceImp.deleteById(8l);
    }
}
