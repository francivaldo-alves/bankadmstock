package com.f3pro.bankadmstock.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){

        super("Resource Not found with i=" + id);

    }
    
}
