package com.rodrigovellozo.browdelivery.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = true)
    private Cliente cliente;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Item> itens;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date data;

    @Min(1)
    private Double valorTotal;

    public Pedido() {
    }

    public Pedido(Long id, Cliente cliente, List<Item> itens, Double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
