package com.pqr.demo.repository;

import com.pqr.demo.models.Persona;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, String> {

}
