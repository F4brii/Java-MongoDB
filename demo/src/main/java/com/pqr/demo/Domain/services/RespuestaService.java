package com.pqr.demo.Domain.services;

import java.util.List;

import com.pqr.demo.Domain.models.Respuesta;
import com.pqr.demo.Infraestructure.context.IRespuestaRepository;
import com.pqr.demo.Infraestructure.repositories.RespuestaRepository;

public class RespuestaService {
    private final RespuestaRepository repository;

    public RespuestaService(IRespuestaRepository repository) {
        this.repository = new RespuestaRepository(repository);
    }

    public List<Respuesta> ListaRespuestas() {
        return this.repository.ListaRespuestas();
    }

    public Respuesta CrearRespuesta(Respuesta rta) {
        return this.repository.CrearRespuesta(rta);
    }
}
