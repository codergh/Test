package com.procurement.service;

import java.util.List;

import com.procurement.domain.Product;

public interface ProductService {
    public List<Product> findAll();
    public void saveProduct(Product product);
    public Product findOne(long id);
}
