package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Persona;

public interface IPersonUseCase {
    List<Persona> ListaPersonas();

    Persona CrearPersona(Persona Persona);
}
