package org.teachplats.connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.dao.StateDAO;

import java.io.IOException;
import java.io.Reader;

public class SessionFactory {

    private final static Logger logger = LogManager.getLogger(StateDAO.class);
    private final static String resourceToRead = "mybatis.config.xml";
    private SqlSession sqlSession = null;

    public SqlSession sqlSessionFactoryBuild() {
        try {
            Reader reader = Resources.getResourceAsReader(resourceToRead);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession(false);
        } catch (IOException ex) {
            logger.warn(ex.getMessage());
        }
        return sqlSession;
    }

}
