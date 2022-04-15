package com.f3pro.bankadmstock.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandarError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Instant timInstant;
    private Integer status;
    private String error;
    private String messege;
    private String path;

    public StandarError(){}

    public StandarError(Instant timInstant, Integer status, String error, String messege, String path) {
        this.timInstant = timInstant;
        this.status = status;
        this.error = error;
        this.messege = messege;
        this.path = path;
    }

    public Instant getTimInstant() {
        return timInstant;
    }

    public void setTimInstant(Instant timInstant) {
        this.timInstant = timInstant;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    
    
}
