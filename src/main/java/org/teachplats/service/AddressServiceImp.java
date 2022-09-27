package org.teachplats.service;

import org.teachplats.dao.AddressDAO;
import org.teachplats.dao.CityDAO;
import org.teachplats.model.Address;
import org.teachplats.model.City;

import java.util.List;

public class AddressServiceImp implements IAddressService{
    private AddressDAO addressDAO = new AddressDAO();

    @Override
    public void create(Address address) {
        addressDAO.create(address);
    }

    @Override
    public Address searchById(Long id) {
        return addressDAO.getById(id);
    }

    @Override
    public List<Address> listAll() {
        return addressDAO.getAll();
    }

    @Override
    public void update(Address address) {
        addressDAO.update(address);
    }

    @Override
    public void deleteById(Long id) {
        addressDAO.removeById(id);
    }
}
