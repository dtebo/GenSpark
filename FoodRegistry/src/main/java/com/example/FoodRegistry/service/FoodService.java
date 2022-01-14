package com.example.FoodRegistry.service;

import com.example.FoodRegistry.entity.Food;

import java.util.List;

public interface FoodService {
    List<Food> findAll();
    Object findById(int id);
    void saveOrUpdate(Food theFood);
    void deleteById(int id);
}
