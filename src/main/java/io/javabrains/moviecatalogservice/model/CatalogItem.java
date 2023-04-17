package io.javabrains.moviecatalogservice.model;

public class CatalogItem {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private String name;

    public CatalogItem(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    private String description;
    private int rating;


}
