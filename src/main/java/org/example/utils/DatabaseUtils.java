package org.example.utils;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.config.JdbiConfig;
import org.jdbi.v3.core.spi.JdbiPlugin;

import java.sql.SQLException;

public class DatabaseUtils {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/wildlife_tracker";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    private static final Jdbi jdbi = initJdbi();

    private static Jdbi initJdbi() {
        return Jdbi.create(DATABASE_URL, USER, PASSWORD)
                .installPlugin(new AnimalPlugin())  // Add additional plugins if needed
                .installPlugin(new EndangeredAnimalPlugin())
                .installPlugin(new SightingPlugin());
    }

    public static Jdbi getJdbi() {
        return jdbi;
    }

    public static <T> T getDao(Class<T> daoClass) {
        return getJdbi().onDemand(daoClass);
    }

    private static class AnimalPlugin implements JdbiPlugin {
        @Override
        public void customizeJdbi(Jdbi jdbi) throws SQLException {
            // Customize Jdbi for the Animal class if needed
        }
    }

    private static class EndangeredAnimalPlugin implements JdbiPlugin {
        @Override
        public void customizeJdbi(Jdbi jdbi) throws SQLException {
            // Customize Jdbi for the EndangeredAnimal class if needed
        }
    }

    private static class SightingPlugin implements JdbiPlugin {
        @Override
        public void customizeJdbi(Jdbi jdbi) throws SQLException {
            // Customize Jdbi for the Sighting class if needed
        }
    }
}