package com.pqr.demo.Domain.interfaces;

import java.util.List;

import com.pqr.demo.Domain.models.PQR;

public interface IPQR {
    List<PQR> ListaPQRs();

    PQR CrearPQR(PQR pqr);
}
