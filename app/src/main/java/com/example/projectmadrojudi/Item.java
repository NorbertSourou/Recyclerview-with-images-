package com.example.projectmadrojudi;

public class Item {
    private String image, title, date, descriprion;

    public Item() {
    }

    public Item(String image, String title, String date, String descriprion) {
        this.image = image;
        this.title = title;
        this.date = date;
        this.descriprion = descriprion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }
}
