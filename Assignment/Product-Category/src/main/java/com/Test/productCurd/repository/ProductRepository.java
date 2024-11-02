package com.Test.productCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Test.productCurd.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

