package com.f3pro.bankadmstock.repositories;

import com.f3pro.bankadmstock.entities.Products;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
    
}
