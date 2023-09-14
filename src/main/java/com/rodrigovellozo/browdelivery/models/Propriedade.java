package com.rodrigovellozo.browdelivery.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Propriedade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String value;
    private String description;
    private String category;
    private String subcategory;

    protected Propriedade() {
    }

    public Propriedade(String name, String value, String description, String category, String subcategory) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.category = category;
        this.subcategory = subcategory;
    }

    @Override
    public String toString() {
        return "Propriedade [id=" + id + ", name=" + name + ", value=" + value + ", description=" + description
                + ", category="
                + category + ", subcategory=" + subcategory + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getvalue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getcategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getsubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

}
