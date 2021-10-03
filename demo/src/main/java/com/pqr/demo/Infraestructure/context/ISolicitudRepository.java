package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.Solicitud;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISolicitudRepository extends MongoRepository<Solicitud, String> {
    
}
