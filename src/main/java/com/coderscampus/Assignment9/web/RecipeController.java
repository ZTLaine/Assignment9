//  6/2/24
//  Zack Laine
//  Assignment 9

package com.coderscampus.Assignment9.web;

import com.coderscampus.Assignment9.domain.Recipe;
import com.coderscampus.Assignment9.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController() throws IOException {
        recipeService = new RecipeService();
    }

    @GetMapping("/gluten-free")
    public List<Recipe> glutenFree() throws IOException {
        return recipeService.getGlutenFreeRecipes();
    }

    @GetMapping("/vegan")
    public List<Recipe> vegan() throws IOException {
        return recipeService.getVeganRecipes();
    }

    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> veganAndGlutenFree() throws IOException {
        return recipeService.getVeganAndGlutenFreeRecipes();
    }

    @GetMapping("/vegetarian")
    public List<Recipe> vegetarian() throws IOException {
        return recipeService.getVegetarianRecipes();
    }

    @GetMapping("/all-recipes")
    public List<Recipe> allRecipes() throws IOException {
        return recipeService.getAllRecipes();
    }
}
