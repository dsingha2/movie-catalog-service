package io.javabrains.moviecatalogservice.model;

import java.util.List;

public class UserRatings {

    public List<Ratings> getRatingsList() {
        return ratingsList;
    }

    public UserRatings() {
    }

    public void setRatingsList(List<Ratings> ratingsList) {
        this.ratingsList = ratingsList;
    }

    public UserRatings(List<Ratings> ratingsList) {
        this.ratingsList = ratingsList;
    }

    private List<Ratings> ratingsList;
}
