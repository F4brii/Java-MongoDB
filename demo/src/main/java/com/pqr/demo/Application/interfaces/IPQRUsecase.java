package com.pqr.demo.Application.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.PQR;

public interface IPQRUsecase {
    List<PQR> ListaPQRs();

    PQR CrearPQR(PQR pqr);
}
