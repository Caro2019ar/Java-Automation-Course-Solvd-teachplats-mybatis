package org.teachplats.service;

import org.teachplats.dao.CountryDAO;
import org.teachplats.dao.StateDAO;
import org.teachplats.model.State;

import java.util.List;

public class StateServiceImp implements IStateService{
    private StateDAO stateDAO = new StateDAO();

    @Override
    public void create(State state) {
        stateDAO.create(state);
    }

    @Override
    public State searchById(Long id) {
        return stateDAO.getById(id);
    }

    @Override
    public List<State> listAll() {
        return stateDAO.getAll();
    }

    @Override
    public void update(State state) {
        stateDAO.update(state);
    }

    @Override
    public void deleteById(Long id) {
        stateDAO.removeById(id);
    }
}
