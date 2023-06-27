package com.example.springSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springSecurity.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}

