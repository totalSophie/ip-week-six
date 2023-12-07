package org.example.dao;

import org.example.interfaces.ISightings;
import org.example.models.Sightings;
import org.sql2o.Connection;

import java.util.List;

public class SightingDao implements ISightings {

    /**
     * @param id
     * @return
     */
    @Override
    public Sightings getSighting(Connection conn, int id) {
        try {
            return conn.createQuery("SELECT * FROM sightings WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Sightings.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return
     */
    @Override
    public List<Sightings> getSightings(Connection conn) {
        try {
            return conn.createQuery("SELECT * FROM sightings")
                    .executeAndFetch(Sightings.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param sighting
     * @return
     */
    @Override
    public boolean createSighting(Connection conn, Sightings sighting) {
        try {
            return conn.createQuery("INSERT INTO sightings (loc, animalid, rangerid) " +
                            "VALUES (:loc, :animalId, :rangerId)")
                    .bind(sighting)
                    .executeUpdate().getResult() > 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param sighting
     * @return
     */
    @Override
    public boolean updateSighting(Connection conn, Sightings sighting, int id) {
        try {

            return conn.createQuery("UPDATE sightings SET loc = :loc, animalid = :animalId," +
                            " rangerid = :rangerId WHERE id = :id")
                    .addParameter("id", id)
                    .addParameter("loc", sighting.getLoc())
                    .addParameter("animalId", sighting.getAnimalId())
                    .addParameter("rangerId", sighting.getRangerId())
                    .executeUpdate()
                    .getResult() > 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean deleteSighting(Connection conn, int id) {
        try {
            return conn.createQuery("DELETE FROM sightings WHERE id = :id")
                    .addParameter("id", id)
                    .executeUpdate()
                    .getResult() > 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
