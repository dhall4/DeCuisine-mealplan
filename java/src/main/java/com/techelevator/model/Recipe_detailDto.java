package com.techelevator.model;

import java.util.List;

public class Recipe_detailDto {

    private Recipe recipe;

    public Recipe_detailDto() {}

    public Recipe_detailDto(Recipe recipe) {
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public static class IngredientDetail {
        private String ingredientName;
        private double amount;
        private String unitType;
        private String systemOfMeasurement;

        public IngredientDetail() {}

        public IngredientDetail(String ingredientName, double amount, String unitType, String systemOfMeasurement) {
            this.ingredientName = ingredientName;
            this.amount = amount;
            this.unitType = unitType;
            this.systemOfMeasurement = systemOfMeasurement;
        }

        public String getIngredientName() {
            return ingredientName;
        }

        public void setIngredientName(String ingredientName) {
            this.ingredientName = ingredientName;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getUnitType() {
            return unitType;
        }

        public void setUnitType(String unitType) {
            this.unitType = unitType;
        }

        public String getSystemOfMeasurement() {
            return systemOfMeasurement;
        }

        public void setSystemOfMeasurement(String systemOfMeasurement) {
            this.systemOfMeasurement = systemOfMeasurement;
        }
    }
}
