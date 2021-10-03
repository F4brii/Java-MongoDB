package com.pqr.demo.Domain.services;

import java.util.List;

import com.pqr.demo.Domain.models.Tipo;
import com.pqr.demo.Infraestructure.context.ITipoRepository;
import com.pqr.demo.Infraestructure.repositories.TipoRepository;

public class TipoService {
    private final TipoRepository repository;

    public TipoService(ITipoRepository repository) {
        this.repository = new TipoRepository(repository);
    }

    public List<Tipo> ListaPersonas(){
        return this.repository.ListaTipos();
    }

    public Tipo CrearTipo(Tipo tipo){
        return this.repository.CrearTipo(tipo);
    }

    public Tipo ObtenerTipo(String id){
        return this.repository.ObtenerTipo(id);
    }
}
