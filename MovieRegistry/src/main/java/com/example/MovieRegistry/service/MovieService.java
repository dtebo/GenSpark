package com.example.MovieRegistry.service;

import com.example.MovieRegistry.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Object findById(int id);
    void saveOrUpdate(Movie theMovie);
    void deleteById(int id);
}
