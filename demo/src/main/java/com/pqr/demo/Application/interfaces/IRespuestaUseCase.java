package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Respuesta;

public interface IRespuestaUseCase {
    List<Respuesta> ListaRespuestas();

    Respuesta CrearRespuesta(Respuesta rta);
}
