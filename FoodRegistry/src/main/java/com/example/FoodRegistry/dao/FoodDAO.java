package com.example.FoodRegistry.dao;

import com.example.FoodRegistry.entity.Food;

import java.util.List;

public interface FoodDAO {
    List<Food> findAll();
    Object findById(int id);
    void saveOrUpdate(Food theFood);
    void deleteById(int id);
}
