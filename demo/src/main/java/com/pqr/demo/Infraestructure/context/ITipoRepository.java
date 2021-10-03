package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.Tipo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITipoRepository extends MongoRepository<Tipo, String>{
    
}
