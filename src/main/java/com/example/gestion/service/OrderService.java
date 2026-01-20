package com.example.gestion.service;


import com.example.gestion.model.Product;
import com.example.gestion.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final ProductService productService;

    public OrderService(ProductService productService) {
        this.productService = productService;
    }

    public double calcularTotal(List<String> productos) {
        double total = 0;

        for (String nombre : productos) {
            total += productService.obtenerPrecio(nombre);
        }

        return total;
    }
}
