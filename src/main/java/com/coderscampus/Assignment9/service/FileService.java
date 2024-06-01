package com.coderscampus.Assignment9.service;

import com.coderscampus.Assignment9.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileService {

    @Test
    public void readFile() throws IOException {
        List<Recipe> recipes = new ArrayList<>();

        Reader in = new FileReader("path/to/file.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            Recipe recipe = new Recipe();
            recipe.setCookingMinutes(Integer.parseInt(record.get("Cooking Minutes")));
            recipe.setDairyFree(Boolean.parseBoolean(record.get("Dairy Free")));
            recipe.setGlutenFree(Boolean.parseBoolean(record.get("Gluten Free")));
            recipe.setDairyFree(Boolean.parseBoolean(record.get("Dairy Free")));
            recipe.setInstructions(record.get("Instructions"));
            recipe.setPreparationMinutes(Double.parseDouble(record.get("Preparation Minutes")));
            recipe.setPricePerServing(Double.parseDouble(record.get("Price Per Serving")));
            recipe.setReadyInMinutes(Integer.parseInt(record.get("Ready In Minutes")));
            recipe.setServings(Integer.parseInt(record.get("Servings")));
            recipe.setSpoonacularScore(Double.parseDouble(record.get("Spoonacular Score")));
            recipe.setTitle(record.get("Title"));
            recipe.setVegan(Boolean.parseBoolean(record.get("Vegan")));
            recipe.setVegetarian(Boolean.parseBoolean(record.get("Vegetarian")));
            recipes.add(recipe);

            assertEquals(recipe.getGlutenFree(),true);

        }

    }
}
