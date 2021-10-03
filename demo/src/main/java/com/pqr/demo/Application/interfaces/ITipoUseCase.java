package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Tipo;

public interface ITipoUseCase {
    List<Tipo> ListaTipos();

    Tipo CrearTipo(Tipo tipo);

    Tipo ObtenerTipo(String id);
}
