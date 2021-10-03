package com.pqr.demo.Infraestructure.repositories;

import java.util.List;
import java.util.Optional;

import com.pqr.demo.Domain.interfaces.IUsuario;
import com.pqr.demo.Domain.models.Usuario;
import com.pqr.demo.Infraestructure.context.IUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioRepository implements IUsuario {

    private final IUsuarioRepository repository;

    @Autowired
    public UsuarioRepository(IUsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> ListaUsuarios() {
        return this.repository.findAll();
    }

    @Override
    public Usuario CrearUsuario(Usuario usuario) {
        return this.repository.insert(usuario);
    }

    @Override
    public Usuario Login(String usuario, String pass) {
        return this.repository.Login(usuario, pass);
    }

    @Override
    public Usuario ObtenerUsuarioId(String id) {
        return this.repository.ObtenerUsuarioId(id);
    }
    
}
