package com.pqr.demo.Domain.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "respuestas")
public class Respuesta {
    @Id
    private String id;
    private String respuesta;    

    public Respuesta() {
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getId() {
        return id;
    }
}
