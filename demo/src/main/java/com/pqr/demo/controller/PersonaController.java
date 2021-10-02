package com.pqr.demo.controller;

import com.pqr.demo.repository.PersonaRepository;
import com.pqr.demo.models.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    @Autowired
    PersonaRepository repository;

    @GetMapping("/")
    public List<Persona> ListadoPersonas() {
        return repository.findAll();
    }
}
