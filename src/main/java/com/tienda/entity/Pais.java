package com.tienda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "paises")
public class Pais implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String pais;

    public long getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public void setId(long i) {
        this.id = i;
    }

    public void setPais(String p) {
        this.pais = p;
    }
}
