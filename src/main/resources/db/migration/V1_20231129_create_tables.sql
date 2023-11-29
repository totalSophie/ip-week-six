CREATE TABLE animals (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);

CREATE TABLE endangered_animals (
                                    id SERIAL PRIMARY KEY,
                                    name VARCHAR(255) NOT NULL,
                                    health VARCHAR(50) NOT NULL,
                                    age VARCHAR(50) NOT NULL
);

CREATE TABLE sightings (
                           id SERIAL PRIMARY KEY,
                           species_id VARCHAR(255) NOT NULL,
                           location VARCHAR(255) NOT NULL,
                           ranger_name VARCHAR(255) NOT NULL,
                           timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
