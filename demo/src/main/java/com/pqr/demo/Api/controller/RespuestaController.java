package com.pqr.demo.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.pqr.demo.Application.UseCase.RespuestaUseCase;
import com.pqr.demo.Domain.models.Respuesta;
import com.pqr.demo.Infraestructure.context.IRespuestaRepository;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/respuestas")
public class RespuestaController {

    private final RespuestaUseCase useCase;

    public RespuestaController(IRespuestaRepository repository) {
        this.useCase = new RespuestaUseCase(repository);
    }

    @GetMapping("/")
    public ResponseEntity<List<Respuesta>> ListadoRespuesta() {
        try {
            return new ResponseEntity<List<Respuesta>>(useCase.ListaRespuestas(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<Respuesta>>(useCase.ListaRespuestas(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Respuesta> CrearRespuesta(@Validated @RequestBody Respuesta respuesta) {
        try {
            return new ResponseEntity<Respuesta>(useCase.CrearRespuesta(respuesta), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Respuesta>(useCase.CrearRespuesta(respuesta), HttpStatus.BAD_REQUEST);
        }
    }
    
}
