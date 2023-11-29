package org.example.dao;

import org.example.models.Sighting;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface SightingDao {
    @SqlUpdate("INSERT INTO sightings (species_id, location, ranger_name) VALUES (?, ?, ?)")
    void insertSighting(String speciesId, String location, String rangerName);

    @SqlQuery("SELECT * FROM sightings")
    List<Sighting> getAllSightings();
}
