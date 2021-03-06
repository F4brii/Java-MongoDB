import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';

import { Login } from '../models/login';
import { Usuario } from '../models/usuario';
import { Persona } from '../models/persona';
import { Pqr } from '../models/pqr';
import { Tipo } from '../models/tipo';
import { Solicitud } from '../models/solicitud';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  restUrl = "http://localhost:90"

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

  ObtenerTipos(): Observable<Tipo[]> {
    return this.http.get<Tipo[]>(`${this.restUrl}/api/tipos/`,  this.httpOptions);
  }

  ObtenerTipo(id: string): Observable<Tipo> {
    return this.http.get<Tipo>(`${this.restUrl}/api/tipos/${id}`,  this.httpOptions);
  }

  CrearSolicitud(solicitud: Solicitud): Observable<Solicitud> {
    return this.http.post<Solicitud>(`${this.restUrl}/api/solicitudes/`, solicitud, this.httpOptions);
  }
}
