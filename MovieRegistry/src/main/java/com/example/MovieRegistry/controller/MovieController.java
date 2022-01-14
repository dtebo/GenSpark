package com.example.MovieRegistry.controller;

import com.example.MovieRegistry.entity.Movie;
import com.example.MovieRegistry.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(@Qualifier("movieServiceIMPL")MovieService movieService){ this.movieService = movieService; }

    @GetMapping("/retrieveAllMovies")
    public List<Movie> findAll() { return movieService.findAll(); }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie theMovie){
        theMovie.setId(0);

        movieService.saveOrUpdate(theMovie);
        return theMovie;
    }

    @PutMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie updateMovie){
        movieService.saveOrUpdate(updateMovie);
        return updateMovie;
    }

    @DeleteMapping("/deleteMovie/{movieId}")
    public String deleteMovie(@PathVariable int movieId){
        movieService.deleteById(movieId);
        return "Deleted movie id: " + movieId;
    }
}
