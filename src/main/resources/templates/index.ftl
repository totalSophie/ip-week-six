<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wildlife Tracker</title>
    <link rel="stylesheet" href="/public/style.css">
</head>
<body>
<h1>Wildlife Sightings</h1>
<ul>
    <#list sightings as sighting>
        <li>${sighting.speciesId} - ${sighting.location} (${sighting.timestamp}) - Reported by ${sighting.rangerName}</li>
    </#list>
</ul>
<form method="POST" action="/submit_sighting">
    <label for="species_id">Species ID:</label>
    <input type="text" name="species_id" required>
    <label for="location">Location:</label>
    <input type="text" name="location" required>
    <label for="ranger_name">Ranger Name:</label>
    <input type="text" name="ranger_name" required>
    <button type="submit">Submit Sighting</button>
</form>
</body>
</html>
