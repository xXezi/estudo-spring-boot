package com.localdomainxezi.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localdomainxezi.produtosapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
}