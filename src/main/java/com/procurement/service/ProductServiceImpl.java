package com.procurement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.procurement.domain.Product;
import com.procurement.service.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findOne(long id) {
        return productRepository.findOne(id);
    }

}
