import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Solicitud } from 'src/app/models/solicitud';
import { Tipo } from 'src/app/models/tipo';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.css']
})
export class CrearComponent implements OnInit {

  Lista: Tipo[] = [];
  seleccionado!: Tipo;
  form: FormGroup;

  constructor(private service: ApiService, private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      tipo: ['', Validators.required],
      cuerpo: ['', Validators.required]
    });

  }

  ngOnInit(): void {
    this.ObtenerTipos();
  }

  ObtenerTipos() {
    this.service.ObtenerTipos().subscribe(data => {
      this.Lista = data;
    });
  }

  onChange(value: string) {
    console.log(value); // Aquí iría tu lógica al momento de seleccionar algo
  }

  send(): any {
    console.log(this.form.value.tipo)
    this.service.ObtenerTipo(this.form.value.tipo).subscribe(tipo =>{
      this.service.ObtenerPersona(String (localStorage.getItem('user'))).subscribe(user =>{
        let solicitud = new Solicitud();
        solicitud.tipo = tipo;
        solicitud.persona= user.persona;
        solicitud.cuerpoSolicitud = this.form.value.cuerpo;
        solicitud.estado = true;
        solicitud.fechaSolicitud = new Date();
        this.service.CrearSolicitud(solicitud).subscribe(soli =>{
          console.log(soli);
          location.href="pqrs";
        })
      });
    });
  }

}
