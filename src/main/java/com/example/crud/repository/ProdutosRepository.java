package com.example.crud.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.models.ProdutoModel;

@Repository
public interface ProdutosRepository extends JpaRepository <ProdutoModel, UUID> {
    
}
