package com.pqr.demo.Application.UseCase;

import java.util.List;

import com.pqr.demo.Application.interfaces.ISolicitudUseCase;
import com.pqr.demo.Domain.models.Solicitud;
import com.pqr.demo.Domain.services.SolicitudService;
import com.pqr.demo.Infraestructure.context.ISolicitudRepository;

public class SolicitudUseCase implements ISolicitudUseCase {
    private final SolicitudService services;

    public SolicitudUseCase(ISolicitudRepository repository) {
        this.services = new SolicitudService(repository);
    }

    @Override
    public List<Solicitud> ListaSolicituds() {
        return this.services.ListaSolicituds();
    }

    @Override
    public Solicitud CrearSolicitud(Solicitud solicitud) {
        return this.services.CrearSolicitud(solicitud);
    }
    
}
