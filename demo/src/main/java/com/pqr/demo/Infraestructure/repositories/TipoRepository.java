package com.pqr.demo.Infraestructure.repositories;

import java.util.List;

import com.pqr.demo.Domain.interfaces.ITipo;
import com.pqr.demo.Domain.models.Tipo;
import com.pqr.demo.Infraestructure.context.ITipoRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class TipoRepository implements ITipo {

    private final ITipoRepository repository;

    @Autowired
    public TipoRepository(ITipoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Tipo> ListaTipos() {
        return this.repository.findAll();
    }

    @Override
    public Tipo CrearTipo(Tipo tipo) {
        return this.repository.insert(tipo);
    }
    
}
