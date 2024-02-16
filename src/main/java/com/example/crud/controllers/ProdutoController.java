package com.example.crud.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.dtos.ProdutoRecordDto;
import com.example.crud.models.ProdutoModel;
import com.example.crud.repository.ProdutosRepository;

import jakarta.validation.Valid;

@RestController
public class ProdutoController {

    // injeçao do ponto via anotavao podeira tbm ser via construtor
    @Autowired
    ProdutosRepository produtosRepository;

    // Método para criar um produto
    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody @Valid ProdutoRecordDto produtoRecordDto) {
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoRecordDto, produtoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtosRepository.save(produtoModel));
    }

    // Método para Listar os produtos
    @GetMapping("produtos")
    public ResponseEntity<List<ProdutoModel>> listarTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(produtosRepository.findAll());
    }

}
