package org.teachplats.connection.postgres_jdbc;


public abstract  class AbstractPostgresJDBC {

    protected final static String user = System.getenv("POSTGRES_USER");
    protected final static String password = System.getenv("POSTGRES_PASSWORD");
    protected final static String url= "jdbc:postgresql://localhost:5432/postgres";
    //final static String url= "jdbc:postgresql://localhost:5432/teachdb";

}
