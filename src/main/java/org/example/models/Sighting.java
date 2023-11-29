package org.example.models;

import java.time.LocalDateTime;

public class Sighting {
    private int id;
    private String speciesId;
    private String location;
    private String rangerName;
    private LocalDateTime timestamp;

    public Sighting(int id, String speciesId, String location, String rangerName, LocalDateTime timestamp) {
        this.id = id;
        this.speciesId = speciesId;
        this.location = location;
        this.rangerName = rangerName;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(String speciesId) {
        this.speciesId = speciesId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRangerName() {
        return rangerName;
    }

    public void setRangerName(String rangerName) {
        this.rangerName = rangerName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
