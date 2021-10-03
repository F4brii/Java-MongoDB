package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Domain.models.Persona;

public interface IPQRUsecase {
    List<PQR> ListaPQRs();

    PQR CrearPQR(PQR pqr);

    List<PQR> ListaPQRsPersonas(String id);
}
