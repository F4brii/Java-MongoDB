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

import com.pqr.demo.Application.UseCase.PQRUseCase;
import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Infraestructure.context.IPQRRepository;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/pqrs")
public class PQRController {
    private final PQRUseCase useCase;

    public PQRController(IPQRRepository repository) {
        this.useCase = new PQRUseCase(repository);
    }

    @Autowired
    IPQRRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<PQR>> ListadoPQR() {
        try {
            return new ResponseEntity<List<PQR>>(useCase.ListaPQRs(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<PQR>>(useCase.ListaPQRs(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public ResponseEntity<PQR> CrearPQR(@Validated @RequestBody PQR pqr) {
        try {
            return new ResponseEntity<PQR>(useCase.CrearPQR(pqr), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<PQR>(useCase.CrearPQR(pqr), HttpStatus.BAD_REQUEST);
        }
    }
}
