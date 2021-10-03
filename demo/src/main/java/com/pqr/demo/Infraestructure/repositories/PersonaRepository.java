package com.pqr.demo.Infraestructure.repositories;

import java.util.List;

import com.pqr.demo.Domain.interfaces.IPersona;
import com.pqr.demo.Domain.models.Persona;
import com.pqr.demo.Infraestructure.context.IPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonaRepository implements IPersona {
    private final IPersonaRepository repository;

    @Autowired
    public PersonaRepository(IPersonaRepository _repository) {
        this.repository = _repository;
    }

    @Override
    public List<Persona> ListaPersonas() {
        return repository.findAll();
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        return repository.insert(persona);
    }
    
}
