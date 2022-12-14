package org.teachplats.dao;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.exception.ResourceNotFoundException;
import org.teachplats.model.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO extends BaseDAO<Country> implements ICountryDAO {
    private final static Logger logger = LogManager.getLogger(CountryDAO.class);
    private Connection connection;
    private final static String INSERT = "INSERT INTO Countries (NAME) VALUES (?)";
    private final static String SELECT = "SELECT * FROM Countries WHERE ID = ?";
    private final static String DELETE = "DELETE FROM Countries WHERE ID = ?";
    private final static String UPDATE = "UPDATE Countries C SET C.Name =? WHERE ID = ?";
    private final static String SELECTALL = "SELECT * FROM Countries";

    public CountryDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Country country) {
        try (PreparedStatement pstm = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, country.getName());
            pstm.execute();
            try (ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()) {
                    country.setId(rst.getLong(1));
                }
            }
        } catch (SQLException e) {
            logger.warn(e.getMessage() + " Could not create the country. ");
        }
        logger.info(country);
    }

    @Override
    public Country getById(Long id) {
        Country country = new Country();
        try (PreparedStatement pstm = connection.prepareStatement(SELECT)) {
            pstm.setLong(1, id);
            try (ResultSet rst = pstm.executeQuery()) {
                if (!rst.isBeforeFirst()) {
                    logger.warn("Could not find a country by this ID: " + id);
                }
                while (rst.next()) {
                    country.setId(rst.getLong("id"));
                    country.setName(rst.getString("name"));
                }
            }
            return country;
        } catch (SQLException e) {
            throw new RuntimeException(" Could not find a country by this ID: ");
        }
    }

    @Override
    public void removeById(Long id) {
        try (PreparedStatement pstm = connection.prepareStatement(DELETE)) {
            pstm.setLong(1, id);
            pstm.execute();
        } catch (SQLException e) {
            logger.warn(e.getMessage() + " Could not remove the country by this ID: " + id);
        }
    }

    @Override
    public void updateCountry(String name, Long id) {
        try (PreparedStatement pstm = connection.prepareStatement(UPDATE, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, name);
            pstm.setLong(2, id);
            pstm.execute();
            try (ResultSet rst = pstm.getGeneratedKeys()) {
                Country country = new Country(name);
                while (rst.next()) {
                    country.setId(rst.getLong(1));
                }
            }
        } catch (SQLException e) {
            logger.warn(e.getMessage() + " Could not update the country by this ID: " + id);
        }
    }

    public List<Country> getAll() {
        List<Country> list = new ArrayList<>();
        try (PreparedStatement pstm = connection.prepareStatement(SELECTALL)) {
            pstm.execute();
            try (ResultSet rst = pstm.executeQuery()) {
                while (rst.next()) {
                    Country country = new Country();
                    country.setId(rst.getLong("id"));
                    country.setName(rst.getString("name"));
                    list.add(country);
                }
            }
            logger.info(list);
            return list;
        } catch (SQLException ex) {
            //logger.warn(ex.getMessage() + " Could not list all countries. ");
            throw new RuntimeException(" Could not list all countries. ");
        }
    }
}
