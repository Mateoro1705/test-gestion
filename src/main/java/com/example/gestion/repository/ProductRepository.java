package com.example.gestion.repository;

import com.example.gestion.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByNombre(String nombre);
}
