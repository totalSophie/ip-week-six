package org.example.database;


import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class Db {
    /**
     * The connection to the database.
     * @return Connection
     */
    public static Connection connect() {
        try {
            return new Sql2o("jdbc:postgresql://localhost:5432/postgres", "postgres", "password").open();
        } catch (Exception exception) {
          throw new RuntimeException("Cannot connect to database.", exception);
        }
    }

}
