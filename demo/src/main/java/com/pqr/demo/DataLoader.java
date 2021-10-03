package com.pqr.demo;

import com.pqr.demo.Domain.interfaces.IUsuario;
import com.pqr.demo.Domain.models.Persona;
import com.pqr.demo.Domain.models.Tipo;
import com.pqr.demo.Domain.models.Usuario;
import com.pqr.demo.Infraestructure.context.IPersonaRepository;
import com.pqr.demo.Infraestructure.context.ITipoRepository;
import com.pqr.demo.Infraestructure.context.IUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private IPersonaRepository personaRepository;
    private IUsuarioRepository usuarioRepository;
    private ITipoRepository tipoRepository;

    @Autowired
    public DataLoader(IPersonaRepository personaRepository, IUsuarioRepository usuarioRepository, ITipoRepository tipoRepository) {
        this.personaRepository = personaRepository;
        this.usuarioRepository = usuarioRepository;

        Persona persona = new Persona();
        persona.setNombres("Generico");
        persona.setApellidos("");
        persona.setCelular("000");
        persona.setCorreo("generico@gamil.com");

        this.personaRepository.insert(persona);

        Usuario usuario = new Usuario();
        usuario.setContrasena("123456");
        usuario.setUsuario("generico");
        usuario.setPersona(persona);

        usuarioRepository.insert(usuario);

        Tipo peticion = new Tipo();
        peticion.setEstado(true);
        peticion.setNombre("Peticion");

        tipoRepository.insert(peticion);

        Tipo queja = new Tipo();
        queja.setEstado(true);
        queja.setNombre("Queja");

        tipoRepository.insert(queja);

        Tipo reclamo = new Tipo();
        reclamo.setEstado(true);
        reclamo.setNombre("Reclamo");

        tipoRepository.insert(reclamo);
    }
}
