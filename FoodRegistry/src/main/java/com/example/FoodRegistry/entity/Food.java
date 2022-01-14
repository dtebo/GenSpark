package com.example.FoodRegistry.entity;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_type")
    private String foodType;

    @Column(name = "calories")
    private int calories;

    @Column(name = "carbs")
    private int carbs;

    public Food() {
    }

    public Food(String foodName, String foodType, int calories, int carbs) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.calories = calories;
        this.carbs = carbs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    @Override
    public String toString(){
        return "Food{" +
                "id=" + id +
                ", foodName=" + foodName + '\'' +
                ", foodType=" + foodType + '\'' +
                ", calories=" + calories + '\'' +
                ", carbs=" + carbs + '\'' +
                "}";
    }
}
