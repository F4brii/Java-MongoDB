import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';

import { Login } from '../models/login';
import { Usuario } from '../models/usuario';
import { Persona } from '../models/persona';
import { Pqr } from '../models/pqr';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  restUrl = "http://localhost:8080"

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  Login(login: Login): Observable<Usuario> {
    return this.http.post<Usuario>(`${this.restUrl}/api/usuarios/login/`, login, this.httpOptions);
  }

  CrearPersona(persona: Persona): Observable<Persona> {
    return this.http.post<Persona>(`${this.restUrl}/api/personas/`, persona, this.httpOptions);
  }

  CrearUsuario(usuario: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(`${this.restUrl}/api/usuarios/`, usuario, this.httpOptions);
  }

  ObtenerPersona(id: string): Observable<Usuario> {
    return this.http.get<Usuario>(`${this.restUrl}/api/usuarios/${id}`,  this.httpOptions);
  }

  ObtenerPQRs(id: string): Observable<Pqr[]> {
    return this.http.get<Pqr[]>(`${this.restUrl}/api/pqrs/persona/${id}`,  this.httpOptions);
  }
}
