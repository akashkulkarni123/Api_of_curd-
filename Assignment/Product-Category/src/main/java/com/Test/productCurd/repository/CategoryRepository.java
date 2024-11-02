package com.Test.productCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Test.productCurd.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

