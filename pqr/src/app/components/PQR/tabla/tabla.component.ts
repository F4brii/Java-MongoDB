import { Component, OnInit } from '@angular/core';
import { Pqr } from 'src/app/models/pqr';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-tabla',
  templateUrl: './tabla.component.html',
  styleUrls: ['./tabla.component.css']
})
export class TablaComponent implements OnInit {

  public Lista: Pqr[] = [];

  constructor(private service: ApiService) { }

  ngOnInit(): void {
    this.obtenerPersona();
  }

  obtenerPersona(){
    this.service.ObtenerPersona(String (localStorage.getItem('user'))).subscribe(data =>{
      this.service.ObtenerPQRs(String (data.persona.id)).subscribe(pqr =>{
        this.Lista = pqr;
      })
    });    
  }

}
