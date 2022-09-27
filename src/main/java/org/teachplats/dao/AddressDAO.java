package org.teachplats.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.connection.SessionFactory;
import org.teachplats.exception.ResourceNotFoundException;
import org.teachplats.model.Address;
import org.teachplats.model.City;

import java.util.List;

public class AddressDAO implements IAddressDAO {

    private final static Logger logger = LogManager.getLogger(AddressDAO.class);

    private static Address address;

    @Override
    public void create(Address address) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                sqlSession.insert("Address.insert", address);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public Address getById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                address = sqlSession.selectOne("Address.selectById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return address;
    }


    @Override
    public void removeById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                sqlSession.delete("Address.deleteById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public void update(Address address) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                Address addressUpdate = (Address) sqlSession.selectOne("Address.selectById", address.getId());
                if (addressUpdate == null) {
                    logger.warn("---------- cityUpdate: " + addressUpdate);
                    throw new ResourceNotFoundException("Couldn't find this ID");
                }
                addressUpdate.setNumber(address.getNumber());
                addressUpdate.setStreet(address.getStreet());
                sqlSession.update("Address.update", addressUpdate);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage() + " Could not update this resource");
                sqlSession.rollback();
            }
        }
    }

    @Override
    public List<Address> getAll() {
        List<Address> addressList = null;
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                addressList = sqlSession.selectList("Address.getAll");
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return addressList;
    }
}
