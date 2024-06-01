package com.coderscampus.Assignment9.service;

import com.coderscampus.Assignment9.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FileService {

    public List<Recipe> readFile() throws IOException {
        List<Recipe> recipes = new ArrayList<>();
        Integer recipeCounter = 0;

        Reader in = new FileReader("recipes.txt");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.withIgnoreSurroundingSpaces().builder()
                .setHeader("Cooking Minutes", "Dairy Free", "Gluten Free",
                        "Instructions", "Preparation Minutes", "Price Per Serving",
                        "Ready In Minutes", "Servings", "Spoonacular Score",
                        "Title", "Vegan", "Vegetarian")
                .setQuoteMode(QuoteMode.ALL)
                .setAllowMissingColumnNames(true)
                .setEscape('\\')
                .build()
                .parse(in);
        for (CSVRecord record : records) {
            Recipe recipe = new Recipe();
            recipe.setCookingMinutes(parseField(record, "Cooking Minutes", Integer::parseInt));
            recipe.setDairyFree(parseField(record, "Dairy Free", Boolean::parseBoolean));
            recipe.setGlutenFree(parseField(record, "Gluten Free", Boolean::parseBoolean));
            recipe.setInstructions(parseField(record, "Instructions", Function.identity()));
            recipe.setPreparationMinutes(parseField(record, "Preparation Minutes", Double::parseDouble));
            recipe.setPricePerServing(parseField(record, "Price Per Serving", Double::parseDouble));
            recipe.setReadyInMinutes(parseField(record, "Ready In Minutes", Integer::parseInt));
            recipe.setServings(parseField(record, "Servings", Integer::parseInt));
            recipe.setSpoonacularScore(parseField(record, "Spoonacular Score", Double::parseDouble));
            recipe.setTitle(parseField(record, "Title", Function.identity()));
            recipe.setVegan(parseField(record, "Vegan", Boolean::parseBoolean));
            recipe.setVegetarian(parseField(record, "Vegetarian", Boolean::parseBoolean));
            recipes.add(recipe);
            System.out.println(recipeCounter + " completed!");
            System.out.println("~~~~");
            System.out.println();
            recipeCounter++;
        }
        return recipes;
    }

    private <T> T parseField(CSVRecord record, String fieldName, Function<String, T> parseFunction){
        String value = record.get(fieldName);
        if (!value.equals(fieldName)){
            System.out.println(fieldName + " read!");
            return parseFunction.apply(value);
        }
        return null;
    }
}
