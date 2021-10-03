package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Domain.models.Persona;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IPQRRepository extends MongoRepository<PQR, String> {
}
