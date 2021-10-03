package com.pqr.demo.Application.UseCase;

import java.util.List;

import com.pqr.demo.Application.interfaces.ITipoUseCase;
import com.pqr.demo.Domain.models.Tipo;
import com.pqr.demo.Domain.services.TipoService;
import com.pqr.demo.Infraestructure.context.ITipoRepository;

public class TipoUseCase implements ITipoUseCase {
    private final TipoService services;

    public TipoUseCase(ITipoRepository repository) {
        this.services = new TipoService(repository);
    }

    @Override
    public List<Tipo> ListaTipos() {
        return this.services.ListaPersonas();
    }

    @Override
    public Tipo CrearTipo(Tipo tipo) {
        return this.services.CrearTipo(tipo);
    }

    @Override
    public Tipo ObtenerTipo(String id) {
        return this.services.ObtenerTipo(id);
    }

}
