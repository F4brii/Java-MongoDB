package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Solicitud;

public interface ISolicitudUseCase {
    List<Solicitud> ListaSolicituds();

    Solicitud CrearSolicitud(Solicitud solicitud);
}
