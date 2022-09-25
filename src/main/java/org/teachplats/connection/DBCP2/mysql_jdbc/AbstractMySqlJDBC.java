package org.teachplats.connection.DBCP2.mysql_jdbc;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public abstract  class AbstractMySqlJDBC {

    protected final static String user = System.getenv("env_user_teachplats");
    protected final static String password = System.getenv("env_password_teachplats");
    protected final static String url= "jdbc:mysql://localhost:3306/teachdb_test?useSSL=false&allowPublicKeyRetrieval=true";
}


/*final static String driver ="com.mysql.jdbc.Driver";

    Properties prop=new Properties();

        try {

            FileInputStream  in = new FileInputStream(System.getProperty("src/main/resources/db.properties"));
            prop.load(in);
            in.close();

            user = prop.getProperty("jdbc.username");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/




