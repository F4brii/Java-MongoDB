package com.pqr.demo.Domain.interfaces;

import java.util.List;
import java.util.Optional;

import com.pqr.demo.Domain.models.Usuario;

public interface IUsuario {
    List<Usuario> ListaUsuarios();

    Usuario CrearUsuario(Usuario usuario);

    Usuario Login(String usuario, String pass);

    Usuario ObtenerUsuarioId(String id);
}
