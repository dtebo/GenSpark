package com.example.MovieRegistry.service;

import com.example.MovieRegistry.dao.MovieDAO;
import com.example.MovieRegistry.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceIMPL implements MovieService {
    private final MovieDAO movieDAO;

    @Autowired
    public MovieServiceIMPL(MovieDAO movieDAO){ this.movieDAO = movieDAO; }

    @Override
    public List<Movie> findAll() { return movieDAO.findAll(); }

    @Override
    public Object findById(int id) { return movieDAO.findById(id); }

    @Override
    public void saveOrUpdate(Movie theMovie) { movieDAO.saveOrUpdate(theMovie); }

    @Override
    public void deleteById(int id) { movieDAO.deleteById(id); }
}
