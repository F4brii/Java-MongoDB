package com.pqr.demo.Infraestructure.repositories;

import java.util.List;

import com.pqr.demo.Domain.interfaces.IPQR;
import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Infraestructure.context.IPQRRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class PQRRepository implements IPQR {

    private final IPQRRepository repository;

    @Autowired
    public PQRRepository(IPQRRepository _repository) {
        this.repository = _repository;
    }

    @Override
    public List<PQR> ListaPQRs() {
        return this.repository.findAll();
    }

    @Override
    public PQR CrearPQR(PQR pqr) {
        return this.repository.insert(pqr);
    }
    
}
