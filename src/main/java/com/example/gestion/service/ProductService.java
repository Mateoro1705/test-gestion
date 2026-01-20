package com.example.gestion.service;


import com.example.gestion.model.Product;
import com.example.gestion.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public double obtenerPrecio(String nombreProducto) {
        Product product = productRepository.findByNombre(nombreProducto);

        if (product == null) {
            throw new IllegalArgumentException("Producto no encontrado");
        }
        return product.getPrecio();
    }

}
