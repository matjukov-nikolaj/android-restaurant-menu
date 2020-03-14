package com.mvs.montresormenu.Model;

public class Food {

    private String categoryId;

    private String description;

    private String name;

    private String price;

    private String weight;

    private String image;

    public Food() {

    }

    public Food(String categoryId, String description, String name, String price, String weight, String image) {
        this.categoryId = categoryId;
        this.description = description;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.image = image;

    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getWeight() {
        return weight;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
