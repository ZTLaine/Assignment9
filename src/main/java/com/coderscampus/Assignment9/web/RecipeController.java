//  6/2/24
//  Zack Laine
//  Assignment 9

package com.coderscampus.Assignment9.web;

import com.coderscampus.Assignment9.domain.Recipe;
import com.coderscampus.Assignment9.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    FileService fileService;

    @GetMapping("/gluten-free")
    public List<Recipe> glutenFree() throws IOException {
        return fileService.readFile().stream()
                .filter(Recipe::getGlutenFree)
                .toList();
    }

    @GetMapping("/vegan")
    public List<Recipe> vegan() throws IOException {
        return fileService.readFile().stream()
                .filter(Recipe::getVegan)
                .toList();
    }

    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> veganAndGlutenFree() throws IOException {
        return fileService.readFile().stream()
                .filter(Recipe::getVegan)
                .filter(Recipe::getGlutenFree)
                .toList();
    }

    @GetMapping("/vegetarian")
    public List<Recipe> vegetarian() throws IOException {
        return fileService.readFile().stream()
                .filter(Recipe::getVegetarian)
                .toList();
    }

    @GetMapping("/all-recipes")
    public List<Recipe> allRecipes() throws IOException {
        return fileService.readFile();
    }
}
