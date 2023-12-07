package org.example;

import org.example.database.Db;
import org.example.database.Seeder;
import org.example.utils.Router;
import org.sql2o.Connection;

public class App {
    public static void main(String[] args) {
        Connection connection = new Db().connect();
        Seeder.seed(connection);
        Router.route(connection);
    }
}