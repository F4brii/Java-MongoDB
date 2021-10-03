package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.Usuario;

public interface IUsuarioUseCase {
    List<Usuario> ListaUsuarios();

    Usuario CrearPersona(Usuario usuario);

    Usuario Login(String usuario, String pass);
}
