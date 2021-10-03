package com.pqr.demo.Domain.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Respuesta;

public interface IRespuesta {
    List<Respuesta> ListaRespuestas();

    Respuesta CrearRespuesta(Respuesta rta);
}
