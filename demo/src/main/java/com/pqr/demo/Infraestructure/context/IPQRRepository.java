package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.PQR;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPQRRepository extends MongoRepository<PQR, String> {
    
}
