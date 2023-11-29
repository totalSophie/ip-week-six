package org.example.services;

import org.example.dao.AnimalDao;
import org.example.dao.EndangeredAnimalDao;
import org.example.dao.SightingDao;
import org.example.utils.DatabaseUtils;

public class WildlifeService {
    private final SightingDao sightingDao;
    private final AnimalDao animalDao;
    private final EndangeredAnimalDao endangeredAnimalDao;

    public WildlifeService() {
        this.sightingDao = DatabaseUtils.getDao(SightingDao.class);
        this.animalDao = DatabaseUtils.getDao(AnimalDao.class);
        this.endangeredAnimalDao = DatabaseUtils.getDao(EndangeredAnimalDao.class);
    }

    public void addSighting(String speciesId, String location, String rangerName) {
        sightingDao.insertSighting(speciesId, location, rangerName);
    }

    public List<Sighting> getAllSightings() {
        return sightingDao.getAllSightings();
    }

    public List<Animal> getAllAnimals() {
        return animalDao.getAllAnimals();
    }

    public List<EndangeredAnimal> getAllEndangeredAnimals() {
        return endangeredAnimalDao.getAllEndangeredAnimals();
    }
}
