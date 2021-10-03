import { Component, OnInit } from '@angular/core';
import { Pqr } from 'src/app/models/pqr';
import { ApiService } from 'src/app/services/api.service';


@Component({
  selector: 'app-pqrs',
  templateUrl: './pqrs.component.html',
  styleUrls: ['./pqrs.component.css']
})
export class PqrsComponent implements OnInit {



  constructor() { }

  ngOnInit(): void {
    let user = localStorage.getItem('user');
    if (user === null || user === "") {
      alert("Debe iniciar sesion");
      location.href = "/";
    }
  }

  CerrarSesion() {
    localStorage.removeItem('user');
    location.href = "/";
  }



}
