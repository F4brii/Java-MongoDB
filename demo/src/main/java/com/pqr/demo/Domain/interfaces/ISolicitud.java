package com.pqr.demo.Domain.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Solicitud;

public interface ISolicitud {
    List<Solicitud> ListaSolicituds();

    Solicitud CrearSolicitud(Solicitud solicitud);
}
