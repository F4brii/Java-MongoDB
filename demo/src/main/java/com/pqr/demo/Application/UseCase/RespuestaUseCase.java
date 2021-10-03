package com.pqr.demo.Application.UseCase;

import java.util.List;

import com.pqr.demo.Application.interfaces.IRespuestaUseCase;
import com.pqr.demo.Infraestructure.context.IRespuestaRepository;
import com.pqr.demo.Domain.models.Respuesta;
import com.pqr.demo.Domain.services.RespuestaService;

public class RespuestaUseCase implements IRespuestaUseCase {

    private final RespuestaService services;

    public RespuestaUseCase(IRespuestaRepository repository) {
        this.services = new RespuestaService(repository);
    }

    @Override
    public List<Respuesta> ListaRespuestas() {
        return this.services.ListaRespuestas();
    }

    @Override
    public Respuesta CrearRespuesta(Respuesta rta) {
        return this.services.CrearRespuesta(rta);
    }

}
