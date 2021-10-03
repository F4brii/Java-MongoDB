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

import com.pqr.demo.Application.UseCase.TipoUseCase;
import com.pqr.demo.Domain.models.Tipo;
import com.pqr.demo.Infraestructure.context.ITipoRepository;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/tipos")
public class TipoController {
    private final TipoUseCase useCase;

    public TipoController(ITipoRepository repository) {
        this.useCase = new TipoUseCase(repository);
    }

    @GetMapping("/")
    public ResponseEntity<List<Tipo>> ListadoTipos() {
        try {
            return new ResponseEntity<List<Tipo>>(useCase.ListaTipos(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<Tipo>>(useCase.ListaTipos(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Tipo> CrearTipo(@Validated @RequestBody Tipo tipo) {
        try {
            return new ResponseEntity<Tipo>(useCase.CrearTipo(tipo), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Tipo>(useCase.CrearTipo(tipo), HttpStatus.BAD_REQUEST);
        }
    }
}
