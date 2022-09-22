package org.teachplats.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.dao.StateDAO;
import org.teachplats.model.Country;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class mybatisCrudTest {

    private final static Logger logger = LogManager.getLogger(StateDAO.class);

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis.config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        try (SqlSession session = sqlSessionFactory.openSession()) {

            Country country = new Country("Colombina");
            //======== Insert
            //insertTest(session, country);

            //======== Select
            selectTest(session);

            //======== Update
//        country.setName("Colombia");
//        country.setId(6l);
//        updateTest(session,country);

            //======== Delete
//        deleteTest(session, 6l);

            session.commit();

        }
    }
    public static void insertTest( SqlSession session,   Country country){
        session.insert("Country.insert",country);
        logger.info("Country inserted" + country);
    }
    public static void selectTest(SqlSession session){
        List<Country> list = session.selectList("Country.getAll");
        logger.info(list.toString());
        //list.forEach(System.out::println);
    }

    public static void updateTest(SqlSession session, Country country){
        session.update("Country.update", country);
        logger.info("Updated: "+country);
    }

    public static void deleteTest(SqlSession session, Long countryId){
        session.delete("Country.deleteById", countryId);
        logger.info("Deleted: "+countryId);
    }
}
