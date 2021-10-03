package com.pqr.demo.Domain.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Tipo;

public interface ITipo {
    List<Tipo> ListaTipos();

    Tipo CrearTipo(Tipo tipo);

    Tipo ObtenerTipo(String id);
}
