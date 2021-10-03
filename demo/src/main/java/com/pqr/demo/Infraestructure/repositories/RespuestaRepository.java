package com.pqr.demo.Infraestructure.repositories;

import java.util.List;

import com.pqr.demo.Domain.interfaces.IRespuesta;
import com.pqr.demo.Domain.models.Respuesta;
import com.pqr.demo.Infraestructure.context.IRespuestaRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class RespuestaRepository implements IRespuesta {

    private final IRespuestaRepository repository;

    @Autowired
    public RespuestaRepository(IRespuestaRepository _repository) {
        this.repository = _repository;
    }

    @Override
    public List<Respuesta> ListaRespuestas() {
        return this.repository.findAll();
    }

    @Override
    public Respuesta CrearRespuesta(Respuesta rta) {
        return this.repository.insert(rta);
    }

}
