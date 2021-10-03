package com.pqr.demo.Api.controller;

import com.pqr.demo.Application.UseCase.PQRUseCase;
import com.pqr.demo.Application.UseCase.SolicitudUseCase;
import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Domain.models.Solicitud;
import com.pqr.demo.Infraestructure.context.IPQRRepository;
import com.pqr.demo.Infraestructure.context.ISolicitudRepository;

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
@RequestMapping("/api/solicitudes")
public class SolitudController {
    private final SolicitudUseCase useCase;
    private final PQRUseCase pqrUseCase;

    public SolitudController(ISolicitudRepository repository, IPQRRepository repository2) {
        this.useCase = new SolicitudUseCase(repository);
        this.pqrUseCase = new PQRUseCase(repository2);
    }

    @GetMapping("/")
    public ResponseEntity<List<Solicitud>> ListadoSolicitudes() {
        try {
            return new ResponseEntity<List<Solicitud>>(useCase.ListaSolicituds(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<Solicitud>>(useCase.ListaSolicituds(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Solicitud> CrearTipo(@Validated @RequestBody Solicitud solicitud) {
        Solicitud auxSolicitud = useCase.CrearSolicitud(solicitud);
        try{
            PQR pqr = new PQR();
            pqr.setRadicado(java.util.UUID.randomUUID().toString());
            pqr.setSolicitud(solicitud);
            try{
                this.pqrUseCase.CrearPQR(pqr);
                return new ResponseEntity<Solicitud>(auxSolicitud, HttpStatus.OK);
            }
            catch(Exception exception){
                return new ResponseEntity<Solicitud>(auxSolicitud, HttpStatus.BAD_REQUEST);
            }
            
        }catch(Exception e){
            return new ResponseEntity<Solicitud>(auxSolicitud, HttpStatus.BAD_REQUEST);
        }
    }
}
