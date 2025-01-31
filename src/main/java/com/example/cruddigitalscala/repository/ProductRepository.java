package com.example.cruddigitalscala.repository;

import com.example.cruddigitalscala.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
