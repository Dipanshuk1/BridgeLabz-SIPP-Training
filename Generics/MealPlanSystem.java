package Generics;

import java.util.*;

interface MealPlan {
    String getMeal();
}

class VegetarianMeal implements MealPlan {
    public String getMeal() { return "Vegetarian Thali"; }
}

class VeganMeal implements MealPlan {
    public String getMeal() { return "Vegan Salad Bowl"; }
}

class KetoMeal implements MealPlan {
    public String getMeal() { return "Keto Chicken Wrap"; }
}

class HighProteinMeal implements MealPlan {
    public String getMeal() { return "Protein Smoothie"; }
}

class Meal<T extends MealPlan> {
    private T meal;
    Meal(T meal) { this.meal = meal; }
    T getMeal() { return meal; }
}

class MealGenerator {
    static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        System.out.println("Your Personalized Meal Plan: " + meal.getMeal().getMeal());
    }
}

public class MealPlanSystem {
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> protein = new Meal<>(new HighProteinMeal());

        MealGenerator.generateMealPlan(veg);
        MealGenerator.generateMealPlan(vegan);
        MealGenerator.generateMealPlan(keto);
        MealGenerator.generateMealPlan(protein);
    }
}