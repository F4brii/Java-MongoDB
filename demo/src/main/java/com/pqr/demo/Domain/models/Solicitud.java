package com.pqr.demo.Domain.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "solicitudes")
public class Solicitud {
    @Id
    private String id;
    private String radicadoReclamo;
    private String cuerpoSolicitud;
    private Date fechaSolicitud;
    private boolean estado;

    @DBRef
    private Persona persona;

    @DBRef
    private Tipo tipo;    

    public Solicitud() {
    }

    public String getRadicado() {
        return radicadoReclamo;
    }

    public void setradicadoReclamo(String radicadoReclamo) {
        this.radicadoReclamo = radicadoReclamo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getCuerpoSolicitud() {
        return cuerpoSolicitud;
    }

    public void setCuerpoSolicitud(String cuerpoSolicitud) {
        this.cuerpoSolicitud = cuerpoSolicitud;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tipo getTipo() {
        return tipo;
    }


    public String getId() {
        return id;
    }
}
