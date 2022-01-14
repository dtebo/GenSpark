package com.example.MovieRegistry.dao;

import com.example.MovieRegistry.entity.Movie;

import java.util.List;

public interface MovieDAO {
    List<Movie> findAll();
    Object findById(int id);
    void saveOrUpdate(Movie theMovie);
    void deleteById(int id);
}
