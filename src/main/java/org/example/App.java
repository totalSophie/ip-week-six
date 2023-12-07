package org.example;

import org.example.controllers.HomeController;
import org.example.services.WildlifeService;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Set up database and services
        WildlifeService wildlifeService = new WildlifeService();

        // Set up static files (CSS, JS, etc.)
        //staticFiles.location("/public");

        // Set up routes
        HomeController homeController = new HomeController(wildlifeService);

        get("/", homeController.getIndex);
        post("/submit_sighting", homeController.submitSighting);
        get("/animals", homeController.getAllAnimals);

        // Add other routes as needed

    }
}
