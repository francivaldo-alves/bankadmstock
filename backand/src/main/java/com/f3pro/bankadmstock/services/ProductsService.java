package com.f3pro.bankadmstock.services;

import java.util.List;
import java.util.Optional;

import com.f3pro.bankadmstock.entities.Products;
import com.f3pro.bankadmstock.repositories.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

    // listar todos os produtos

    public List<Products> findAll() {
        return repository.findAll();
    }

    // listar por ID
    public Products findById(Long id) {
        Optional<Products> obj = repository.findById(id);
        return obj.get();
    }

    //criar um novo produto
    public Products create(Products products){
        return repository.save(products);
    }


     //criar um novo produto
     public Products update(Products products, Long id){
         products.setId(id);
        return repository.save(products);
    }

    //deletar um produto por ID
    public void deleteById(Long id){
        
        repository.deleteById(id);
    }
}
