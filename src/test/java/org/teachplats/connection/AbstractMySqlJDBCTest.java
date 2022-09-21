package org.teachplats.connection;


public abstract  class AbstractMySqlJDBCTest {
    final static String user = System.getenv("env_user_teachplats");
    final static String password = System.getenv("env_password_teachplats");
    final static String url= "jdbc:mysql://localhost:3306/teachdb_test?useSSL=false&allowPublicKeyRetrieval=true";
    
}
