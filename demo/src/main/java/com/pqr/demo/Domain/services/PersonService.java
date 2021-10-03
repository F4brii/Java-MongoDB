package com.pqr.demo.Domain.services;

import java.util.List;

import com.pqr.demo.Domain.models.Persona;
import com.pqr.demo.Infraestructure.context.IPersonaRepository;
import com.pqr.demo.Infraestructure.repositories.PersonaRepository;

public class PersonService {

    private final PersonaRepository repository;

    public PersonService(IPersonaRepository repository) {
        this.repository = new PersonaRepository(repository);
    }

    public List<Persona> ListaPersonas(){
        return this.repository.ListaPersonas();
    }

    public Persona CrearPersona(Persona persona){
        return this.repository.CrearPersona(persona);
    }
}
