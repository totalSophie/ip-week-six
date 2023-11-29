package org.example.dao;

import org.example.models.EndangeredAnimal;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface EndangeredAnimalDao {
    @SqlQuery("SELECT * FROM endangered_animals")
    List<EndangeredAnimal> getAllEndangeredAnimals();
}
