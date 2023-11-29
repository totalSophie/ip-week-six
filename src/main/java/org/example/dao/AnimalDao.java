package org.example.dao;

import org.example.models.Animal;
import org.example.models.EndangeredAnimal;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface AnimalDao {
    @SqlQuery("SELECT * FROM animals")
    List<Animal> getAllAnimals();
}
