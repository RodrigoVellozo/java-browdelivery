package com.rodrigovellozo.browdelivery.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="propriedade")
public class Propriedade implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
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
        return "Propriedade [id=" + "sem id" + ", name=" + name + ", value=" + value + ", description=" + description
                + ", category="
                + category + ", subcategory=" + subcategory + "]";
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
