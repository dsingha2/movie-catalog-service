package io.javabrains.moviecatalogservice.model;

public class Movie {
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String movieId;
    private String name;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public Movie() {
    }
}
