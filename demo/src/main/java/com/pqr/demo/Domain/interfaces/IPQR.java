package com.pqr.demo.Domain.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.PQR;
import com.pqr.demo.Domain.models.Persona;

public interface IPQR {
    List<PQR> ListaPQRs();

    PQR CrearPQR(PQR pqr);

    List<PQR> ListaPQRsPersonas(String id);
}
