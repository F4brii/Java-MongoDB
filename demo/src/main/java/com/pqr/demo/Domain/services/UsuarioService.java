package com.pqr.demo.Domain.services;

import java.util.List;
import java.util.Optional;

import com.pqr.demo.Domain.models.Usuario;
import com.pqr.demo.Infraestructure.context.IUsuarioRepository;
import com.pqr.demo.Infraestructure.repositories.UsuarioRepository;

public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(IUsuarioRepository repository) {
        this.repository = new UsuarioRepository(repository);
    }

    public List<Usuario> ListaUsuarios() {
        return this.repository.ListaUsuarios();
    }

    public Usuario CrearUsuario(Usuario usuario) {
        return this.repository.CrearUsuario(usuario);
    }

    public Usuario Login(String usuario, String pass) {
        return this.repository.Login(usuario, pass);
    }

    public Usuario ObtenerUsuarioId(String id) {
        return this.repository.ObtenerUsuarioId(id);
    }
}
