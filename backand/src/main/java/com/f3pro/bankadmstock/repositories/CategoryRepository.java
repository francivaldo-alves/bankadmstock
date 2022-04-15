package com.f3pro.bankadmstock.repositories;

import com.f3pro.bankadmstock.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}

