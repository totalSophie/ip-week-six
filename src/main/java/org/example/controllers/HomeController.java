package org.example.controllers;

import org.example.models.Animal;
import org.example.models.EndangeredAnimal;
import org.example.models.Sighting;
import org.example.services.WildlifeService;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeController {
    private WildlifeService wildlifeService = null;

    public HomeController(WildlifeService wildlifeService) {
        this.wildlifeService = wildlifeService;
    }

    public Route getIndex = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        List<Sighting> sightings = wildlifeService.getAllSightings();
        List<Animal> animals = wildlifeService.getAllAnimals();
        List<EndangeredAnimal> endangeredAnimals = wildlifeService.getAllEndangeredAnimals();

        model.put("sightings", sightings);
        model.put("animals", animals);
        model.put("endangeredAnimals", endangeredAnimals);

        return new ModelAndView(model, "index.ftl");
    };

    public Route submitSighting = (Request request, Response response) -> {
        try {
            String speciesId = request.queryParams("species_id");
            String location = request.queryParams("location");
            String rangerName = request.queryParams("ranger_name");

            // Validate and handle the sighting submission
            wildlifeService.addSighting(speciesId, location, rangerName);

            response.status(201); // Created
            return "Sighting submitted successfully!";
        } catch (Exception e) {
            response.status(400); // Bad Request
            return "Error submitting sighting: " + e.getMessage();
        }
    };

    public Route getAllAnimals = (Request request, Response response) -> {
        List<Animal> animals = wildlifeService.getAllAnimals();
        Map<String, Object> model = new HashMap<>();
        model.put("animals", animals);
        return new ModelAndView(model, "animals.ftl");
    };
}