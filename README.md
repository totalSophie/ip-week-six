## Project Name

Wildlife Tracker

## 🔭 Project Description

An application that helps Rangers track animals in the wild.

## 👷 Author

Sophia Chisiya

## 🔨 Setup Instructions

### Clone the repository

HTTPS: `git clone https://github.com/totalSophie/ip-week-six.git`

### Install dependencies
```bash
mvn clean install
```

### Create Tables
```sql
CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, " +
                            "username VARCHAR(255) UNIQUE,fullName VARCHAR(255), " +
                            "company VARCHAR(255), password VARCHAR(255));

CREATE TABLE IF NOT EXISTS animals (id SERIAL PRIMARY KEY, " +
                    "animalname VARCHAR(255) UNIQUE, " +
                    "animaltype TEXT, " +
                    "age TEXT, health VARCHAR(255));

CREATE TABLE IF NOT EXISTS sightings " +
                            "(id SERIAL PRIMARY KEY, loc VARCHAR(255), animalid VARCHAR(255), rangerid VARCHAR(255))
```
### Run the application
```bash
mvn exec:java
```

## 💻 Technologies Used

- Java
- Spark
- PostgreSQL

## 👨‍💻 Contact
- totalsophie@gmail.com

## License
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)