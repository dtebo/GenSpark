package com.example.FoodRegistry.controller;

import com.example.FoodRegistry.entity.Food;
import com.example.FoodRegistry.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(@Qualifier("foodServiceIMPL")FoodService foodService){ this.foodService = foodService; }

    @GetMapping("/retrieveAllFood")
    public List<Food> findAll(){ return foodService.findAll(); }

    @PostMapping("/addFood")
    public Food addFood(@RequestBody Food theFood){
        theFood.setId(0);

        foodService.saveOrUpdate(theFood);
        return theFood;
    }

    @PutMapping("/updateFood")
    public Food updateFood(@RequestBody Food updateFood){
        foodService.saveOrUpdate(updateFood);
        return updateFood;
    }

    @DeleteMapping("/deleteFood/{foodId}")
    public String deleteFood(@PathVariable int foodId){
        foodService.deleteById(foodId);
        return "Deleted food id: " + foodId;
    }
}
