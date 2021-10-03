package com.pqr.demo.Infraestructure.repositories;

import java.util.List;

import com.pqr.demo.Domain.interfaces.ISolicitud;
import com.pqr.demo.Domain.models.Solicitud;
import com.pqr.demo.Infraestructure.context.ISolicitudRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class SolicitudRepository implements ISolicitud {
    private final ISolicitudRepository repository;

    @Autowired
    public SolicitudRepository(ISolicitudRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Solicitud> ListaSolicituds() {
        return this.repository.findAll();
    }

    @Override
    public Solicitud CrearSolicitud(Solicitud solicitud) {
        return this.repository.insert(solicitud);
    }
    
}
