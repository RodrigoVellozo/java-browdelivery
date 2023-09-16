package com.rodrigovellozo.browdelivery.dtos;

import java.util.List;

import com.rodrigovellozo.browdelivery.models.Pedido;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteRecordDto (
    @NotNull @NotBlank
    String name,

    @NotNull @NotBlank
    String endereco,

    @NotNull @NotBlank
    List<Pedido> pedidos
) {}
