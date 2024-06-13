//  6/2/24
//  Zack Laine
//  Assignment 9

package com.coderscampus.Assignment9.domain;

import lombok.Data;

@Data
public class Recipe {
    private Integer cookingMinutes;
    private Boolean dairyFree;
    private Boolean glutenFree;
    private String instructions;
    private Double preparationMinutes;
    private Double pricePerServing;
    private Integer readyInMinutes;
    private Integer servings;
    private Double spoonacularScore;
    private String title;
    private Boolean vegan;
    private Boolean vegetarian;

    public Recipe() {
    }

    public Recipe(Integer cookingMinutes, Boolean dairyFree, Boolean glutenFree,
                  String instructions, Double preparationMinutes, Double pricePerServing,
                  Integer readyInMinutes, Integer servings, Double spoonacularScore,
                  String title, Boolean vegan, Boolean vegetarian) {
        this.cookingMinutes = cookingMinutes;
        this.dairyFree = dairyFree;
        this.glutenFree = glutenFree;
        this.instructions = instructions;
        this.preparationMinutes = preparationMinutes;
        this.pricePerServing = pricePerServing;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.spoonacularScore = spoonacularScore;
        this.title = title;
        this.vegan = vegan;
        this.vegetarian = vegetarian;
    }
}
