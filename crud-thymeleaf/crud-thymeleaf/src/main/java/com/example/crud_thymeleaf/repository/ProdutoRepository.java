package com.example.crud_thymeleaf.repository;

import com.example.crud_thymeleaf.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
