import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';

import { Login } from '../models/login';
import { Usuario } from '../models/usuario';

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

  Login(login: Login):Observable<Usuario>{
    return this.http.post<Usuario>(`http://localhost:8080/api/usuarios/login/`, login, this.httpOptions);
  }
}
