package com.coderscampus.Assignment9.web;

import com.coderscampus.Assignment9.domain.Recipe;
import com.coderscampus.Assignment9.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    FileService fileService;

    @GetMapping("/gluten-free")
    public List<Recipe> glutenFree() throws IOException {
        List<Recipe> glutenFreeRecipes = fileService.readFile().stream()
                .filter(Recipe::getGlutenFree)
                .toList();
        return glutenFreeRecipes;
    }

    @GetMapping("/vegan")
    public List<Recipe> vegan() throws IOException {
        List<Recipe> veganRecipes = fileService.readFile().stream()
                .filter(Recipe::getVegan)
                .toList();
        return veganRecipes;
    }

    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> veganAndGlutenFree() throws IOException {
        List<Recipe> veganAndGlutenFreeRecipes = fileService.readFile().stream()
                .filter(Recipe::getVegan)
                .filter(Recipe::getGlutenFree)
                .toList();
        return veganAndGlutenFreeRecipes;
    }

    @GetMapping("/vegetarian")
    public List<Recipe> vegetarian() throws IOException {
        List<Recipe> vegetarianRecipes = fileService.readFile().stream()
                .filter(Recipe::getVegetarian)
                .toList();
        return vegetarianRecipes;
    }

    @GetMapping("/all-recipes")
    public List<Recipe> allRecipes() throws IOException {
        return fileService.readFile();
    }
}
