package com.coderscampus.Assignment9.service;

import com.coderscampus.Assignment9.domain.Recipe;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class RecipeService {
    private final FileService fileService = new FileService();
    private List<Recipe> recipes;

    public RecipeService() throws IOException {
        recipes = fileService.readFile();
    }

    public List<Recipe> getGlutenFreeRecipes() {
        return recipes.stream()
                .filter(Recipe::getGlutenFree)
                .toList();
    }

    public List<Recipe> getVeganRecipes() {
        return recipes.stream()
                .filter(Recipe::getVegan)
                .toList();
    }

    public List<Recipe> getVeganAndGlutenFreeRecipes() {
        return recipes.stream()
                .filter(Recipe::getVegan)
                .filter(Recipe::getGlutenFree)
                .toList();
    }

    public List<Recipe> getVegetarianRecipes() {
        return recipes.stream()
                .filter(Recipe::getVegetarian)
                .toList();
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}
