package com.f3pro.bankadmstock.services;

import java.util.List;
import java.util.Optional;

import com.f3pro.bankadmstock.entities.Category;
import com.f3pro.bankadmstock.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

//listar tudo 
    public List<Category> findAll(){
        return repository.findAll();
        

    }

    // listar por ID
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();

    }
    //Criar um categoria
    public Category create(Category category){

        return repository.save(category);
    }

    // atualizar uma categoria
    public Category update(Category category, Long id){
        category.setId(id);
        return repository.save(category);

    }

    //deletar a categoria por ID.
    public void delete(Long id){

        repository.deleteById(id);
    }
}
