package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.Respuesta;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRespuestaRepository extends MongoRepository<Respuesta, String> {
    
}
