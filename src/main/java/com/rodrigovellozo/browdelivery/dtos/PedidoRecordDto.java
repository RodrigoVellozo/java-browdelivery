package com.rodrigovellozo.browdelivery.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.rodrigovellozo.browdelivery.models.Cliente;
import com.rodrigovellozo.browdelivery.models.Item;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PedidoRecordDto (
    @NotNull @NotBlank
    Cliente cliente,

    @NotNull @NotBlank
    List<Item> itens,

    @NotNull @NotBlank
    Date data,

    @NotNull @NotBlank
    BigDecimal valorTotal
) {}
