package com.pqr.demo.Domain.services;

import java.util.List;

import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Infraestructure.context.IPQRRepository;
import com.pqr.demo.Infraestructure.repositories.PQRRepository;

public class PQRService {
    private final PQRRepository repository;

    public PQRService(IPQRRepository repository) {
        this.repository = new PQRRepository(repository);
    }

    public List<PQR> ListaPQRs() {
        return this.repository.ListaPQRs();
    }

    public PQR CrearPQR(PQR pqr) {
        return this.repository.CrearPQR(pqr);
    }
}
