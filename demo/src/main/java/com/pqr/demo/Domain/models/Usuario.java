package com.pqr.demo.Domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String usuario;
    private String contrasena;    

    @DBRef
    private Persona persona;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, Persona persona) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.persona = persona;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }    

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getId() {
        return id;
    }
}
