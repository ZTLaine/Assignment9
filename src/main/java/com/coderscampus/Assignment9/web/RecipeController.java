package com.coderscampus.Assignment9.web;

import com.coderscampus.Assignment9.domain.Recipe;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class RecipeController {

    @GetMapping("/gluten-free")
    public List<Recipe> glutenFree(List<Recipe> recipes) {
//        Slap the sort logic in here
        List<Recipe> glutenFreeRecipes = new ArrayList<>();
        return glutenFreeRecipes;
    }

    @GetMapping("/vegan")
    public List<Recipe> vegan(List<Recipe> recipes) {
//        Slap the sort logic in here
        List<Recipe> veganRecipes = new ArrayList<>();
        return veganRecipes;
    }

    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> veganAndGlutenFree(List<Recipe> recipes) {
//        Slap the sort logic in here
        List<Recipe> veganAndGlutenFreeRecipes = new ArrayList<>();
        return veganAndGlutenFreeRecipes;
    }

    @GetMapping("/vegetarian")
    public List<Recipe> vegetarian(List<Recipe> recipes) {
//        Slap the sort logic in here
        List<Recipe> vegetarianRecipes = new ArrayList<>();
        return vegetarianRecipes;
    }

    @GetMapping("/all-recipes")
    public List<Recipe> allRecipes(List<Recipe> recipes) {
        return recipes;
    }
}
