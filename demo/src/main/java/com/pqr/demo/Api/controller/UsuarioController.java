package com.pqr.demo.Api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.pqr.demo.Application.UseCase.UsuarioUseCase;
import com.pqr.demo.Domain.models.Usuario;
import com.pqr.demo.Infraestructure.context.IUsuarioRepository;
import com.pqr.demo.Application.DTO.Login;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioUseCase useCase;

    public UsuarioController(IUsuarioRepository repository) {
        this.useCase = new UsuarioUseCase(repository);
    }

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> listadoUsuarios() {
        try {
            return new ResponseEntity<List<Usuario>>(useCase.ListaUsuarios(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<Usuario>>(useCase.ListaUsuarios(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Usuario> CrearUsuario(@Validated @RequestBody Usuario usuario) {
        try {
            return new ResponseEntity<Usuario>(this.useCase.CrearPersona(usuario), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(this.useCase.CrearPersona(usuario), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> Login(@Validated @RequestBody Login login) {
        try {
            return new ResponseEntity<Usuario>(useCase.Login(login.getUsuario(), login.getPass()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(useCase.Login(login.getUsuario(), login.getPass()),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
