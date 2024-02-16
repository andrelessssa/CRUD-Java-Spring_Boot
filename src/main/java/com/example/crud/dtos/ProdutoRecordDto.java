package com.example.crud.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoRecordDto(@NotBlank String nome, @NotNull BigDecimal valor) {
    //como o id é gerado automaticamente nao vamos trabalhar com ele aqui eu posso colocar a validacao
    
}
