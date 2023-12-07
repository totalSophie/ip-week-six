package org.example.database;

import org.sql2o.Connection;

public class Seeder {

    /**
     * Seeds the database with the default data.
     * @param conn
     */
    public static void seed(Connection conn) {
        try {
            conn.createQuery("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, " +
                            "username VARCHAR(255) UNIQUE,fullName VARCHAR(255), " +
                            "company VARCHAR(255), password VARCHAR(255))")
                    .executeUpdate();
            conn.createQuery("CREATE TABLE IF NOT EXISTS animals (id SERIAL PRIMARY KEY, " +
                    "animalname VARCHAR(255) UNIQUE, " +
                    "animaltype TEXT, " +
                    "age TEXT, health VARCHAR(255))").executeUpdate();
            conn.createQuery("CREATE TABLE IF NOT EXISTS sightings " +
                            "(id SERIAL PRIMARY KEY, loc VARCHAR(255), animalid VARCHAR(255), rangerid VARCHAR(255))")
                    .executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Cannot seed database.", e);
        }
    }

    /**
     * Clears the database.
     * @param conn
     */

    public static void clearDb(Connection conn) {
        try {
            conn.createQuery("DROP TABLE IF EXISTS animals CASCADE").executeUpdate();
            conn.createQuery("DROP TABLE IF EXISTS sightings CASCADE").executeUpdate();
            conn.createQuery("DROP TABLE IF EXISTS users CASCADE").executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Cannot clear database.", e);
        }
    }
}
