package com.rodrigovellozo.browdelivery.models;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GenerationType;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=2, max=30, message="O nome deve ter entre {min} e 30 {max}")
    private String nome;

    @NotNull
    @Min(value=20, message="O valor mínimo deve ser {value} reais")
    private Double preco;
}
