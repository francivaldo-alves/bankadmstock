package com.f3pro.bankadmstock.controllers;

import java.net.URI;
import java.util.List;

import com.f3pro.bankadmstock.entities.Products;
import com.f3pro.bankadmstock.services.ProductsService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping({ "/products" })
public class ProductsController {

    @Autowired
    private ProductsService service;

    @GetMapping
    public ResponseEntity<List<Products>> findAll() {
        List<Products> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Products list = service.findById(id);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Products> create(@RequestBody Products products) {
        products = service.create(products);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(products.getId()).toUri();
        return ResponseEntity.created(uri).body(products);

    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Products> update(@RequestBody Products Products, @PathVariable Long id){
        Products= service.update(Products, id);
        return ResponseEntity.noContent().build();

    }
    @DeleteMapping(value ="/{id}" )
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
