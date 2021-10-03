package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.Tipo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ITipoRepository extends MongoRepository<Tipo, String>{
    @Query("{id: ?0}")  
    Tipo ObtenerTipo(String id);
}
