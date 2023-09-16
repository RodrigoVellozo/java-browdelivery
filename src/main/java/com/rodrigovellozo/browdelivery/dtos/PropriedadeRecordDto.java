package com.rodrigovellozo.browdelivery.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PropriedadeRecordDto(
    @NotNull @NotBlank 
    String name,
    
    @NotNull @NotBlank 
    String value,
    
    @NotNull @NotBlank 
    String description,
    
    @NotNull @NotBlank 
    String category,
    
    @NotNull @NotBlank 
    String subcategory
){}
