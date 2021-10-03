package com.pqr.demo.Domain.services;

import java.util.List;

import com.pqr.demo.Domain.models.Solicitud;
import com.pqr.demo.Infraestructure.context.ISolicitudRepository;
import com.pqr.demo.Infraestructure.repositories.SolicitudRepository;

public class SolicitudService {
    private final SolicitudRepository repository;

    public SolicitudService(ISolicitudRepository repository) {
        this.repository = new SolicitudRepository(repository);
    }

    public List<Solicitud> ListaSolicituds() {
        return this.repository.ListaSolicituds();
    }

    public Solicitud CrearSolicitud(Solicitud solicitud) {
        return this.repository.CrearSolicitud(solicitud);
    }
}
