package com.rodrigovellozo.browdelivery.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ItemRecordDto (
    @NotNull @NotBlank
    String nome,
    
    @NotNull @NotBlank
    BigDecimal preco
) {}
