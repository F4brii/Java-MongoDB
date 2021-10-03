package com.pqr.demo.Application.UseCase;

import java.util.List;

import com.pqr.demo.Application.interfaces.IPersonUseCase;
import com.pqr.demo.Domain.models.Persona;
import com.pqr.demo.Domain.services.PersonService;
import com.pqr.demo.Infraestructure.context.IPersonaRepository;

public class PersonUseCase implements IPersonUseCase {
    private final PersonService services;

    public PersonUseCase(IPersonaRepository repository) {
        this.services = new PersonService(repository);
    }

    @Override
    public List<Persona> ListaPersonas() {
        return this.services.ListaPersonas();
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        return this.services.CrearPersona(persona);
    }

}
