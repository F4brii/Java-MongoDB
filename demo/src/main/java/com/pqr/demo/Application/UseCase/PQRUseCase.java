package com.pqr.demo.Application.UseCase;

import java.util.List;

import com.pqr.demo.Application.interfaces.IPQRUsecase;
import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Domain.services.PQRService;
import com.pqr.demo.Infraestructure.context.IPQRRepository;

public class PQRUseCase implements IPQRUsecase {

    private final PQRService services;

    public PQRUseCase(IPQRRepository repository) {
        this.services = new PQRService(repository);
    }

    @Override
    public List<PQR> ListaPQRs() {
        return this.services.ListaPQRs();
    }

    @Override
    public PQR CrearPQR(PQR pqr) {
        return this.services.CrearPQR(pqr);
    }
    
}
