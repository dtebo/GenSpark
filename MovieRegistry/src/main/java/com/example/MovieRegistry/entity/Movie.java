package com.example.MovieRegistry.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "movie_title")
    private String movieTitle;

    @Column(name = "director")
    private String director;

    @Column(name = "year")
    private String year;

    @Column(name = "genre")
    private String genre;

    public Movie() {
    }

    public Movie(String movieTitle, String director, String year, String genre) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.year = year;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "Part{" +
                "id=" + id +
                ", movieTitle=" + movieTitle + '\'' +
                ", director=" + director + '\'' +
                ", year=" + year + '\'' +
                ", genre=" + genre + '\'' +
                "}";
    }
}
