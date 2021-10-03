package com.pqr.demo.Domain.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Persona;

public interface IPersona {
    List<Persona> ListaPersonas();

    Persona CrearPersona(Persona persona);
}
