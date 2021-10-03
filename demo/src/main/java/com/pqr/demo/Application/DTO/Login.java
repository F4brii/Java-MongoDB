package com.pqr.demo.Application.DTO;

public class Login {
    private String usuario;
    private String pass;

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
