package com.pqr.demo.Application.UseCase;

import java.util.List;

import com.pqr.demo.Application.interfaces.IUsuarioUseCase;
import com.pqr.demo.Domain.models.Usuario;
import com.pqr.demo.Domain.services.UsuarioService;
import com.pqr.demo.Infraestructure.context.IUsuarioRepository;

public class UsuarioUseCase implements IUsuarioUseCase {
    private final UsuarioService services;

    public UsuarioUseCase(IUsuarioRepository repository) {
        this.services = new UsuarioService(repository);
    }

    @Override
    public List<Usuario> ListaUsuarios() {
        return this.services.ListaUsuarios();
    }

    @Override
    public Usuario CrearPersona(Usuario usuario) {
        return this.services.CrearUsuario(usuario);
    }

    @Override
    public Usuario Login(String usuario, String pass) {
        return this.services.Login(usuario, pass);
    }
    
}
