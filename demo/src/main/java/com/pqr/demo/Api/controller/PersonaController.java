package com.pqr.demo.Api.controller;

import com.pqr.demo.Application.UseCase.PersonUseCase;
import com.pqr.demo.Domain.models.Persona;
import com.pqr.demo.Infraestructure.context.IPersonaRepository;
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

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    private final PersonUseCase useCase;

    public PersonaController(IPersonaRepository repository) {
        this.useCase = new PersonUseCase(repository);
    }

    @GetMapping("/")
    public ResponseEntity<List<Persona>> ListadoPersonas() {
        try {
            return new ResponseEntity<List<Persona>>(this.useCase.ListaPersonas(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<Persona>>(this.useCase.ListaPersonas(), HttpStatus.BAD_REQUEST);
        }
    }

    // TODO Auto-generated method stub
    @PostMapping("/")
    public ResponseEntity<Persona> CrearPersona(@Validated @RequestBody Persona persona) {
        try {
            return new ResponseEntity<Persona>(this.useCase.CrearPersona(persona), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Persona>(this.useCase.CrearPersona(persona), HttpStatus.BAD_REQUEST);
        }
    }

}
