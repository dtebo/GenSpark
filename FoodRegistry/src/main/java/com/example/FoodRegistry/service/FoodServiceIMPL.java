package com.example.FoodRegistry.service;

import com.example.FoodRegistry.dao.FoodDAO;
import com.example.FoodRegistry.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceIMPL implements FoodService {
    private final FoodDAO foodDAO;

    @Autowired
    public FoodServiceIMPL(FoodDAO foodDAO){ this.foodDAO = foodDAO; }

    @Override
    public List<Food> findAll(){ return foodDAO.findAll(); }

    @Override
    public Object findById(int id) { return foodDAO.findById(id); }

    @Override
    public void saveOrUpdate(Food theFood) { foodDAO.saveOrUpdate(theFood); }

    @Override
    public void deleteById(int id){ foodDAO.deleteById(id); }
}
