package com.procurement.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.procurement.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
