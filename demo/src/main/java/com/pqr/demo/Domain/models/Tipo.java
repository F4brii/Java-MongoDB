package com.pqr.demo.Domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tipos")
public class Tipo {
    @Id
    private String id;
    private String nombre;
    private boolean estado;

    public Tipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getId() {
        return id;
    }
}
