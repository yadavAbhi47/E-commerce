package com.example.project.service;

import com.example.project.model.Product;
import com.example.project.payload.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);
}
