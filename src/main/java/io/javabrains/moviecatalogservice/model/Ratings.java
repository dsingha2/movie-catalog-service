package io.javabrains.moviecatalogservice.model;

public class Ratings {
    public Ratings() {
    }

    public Ratings(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private String movieId;
    private int rating;
}
