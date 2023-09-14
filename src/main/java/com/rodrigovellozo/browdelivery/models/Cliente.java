package com.rodrigovellozo.browdelivery.models;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min = 2, max = 30, message = "O nome deve ter entre {min} e 30 {max}")
    private String name;

    @NotNull
    @Length(min = 2, max = 300, message = "O endereço deve ter entre {min} e 30 {max}")
    private String endereco;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(
            Long id,
            String name,
            String endereco
            ) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;   
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void novoPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

}
