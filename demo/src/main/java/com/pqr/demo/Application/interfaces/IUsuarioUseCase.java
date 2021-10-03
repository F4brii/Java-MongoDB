package com.pqr.demo.Application.interfaces;

import java.util.List;
import java.util.Optional;

import com.pqr.demo.Domain.models.Usuario;

public interface IUsuarioUseCase {
    List<Usuario> ListaUsuarios();

    Usuario CrearPersona(Usuario usuario);

    Usuario Login(String usuario, String pass);

    Usuario ObtenerUsuarioId(String id);
}
