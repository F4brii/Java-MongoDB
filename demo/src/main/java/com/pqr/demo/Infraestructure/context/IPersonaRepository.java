package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.Persona;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPersonaRepository extends MongoRepository<Persona, String> {

}
