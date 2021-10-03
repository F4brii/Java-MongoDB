import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Persona } from 'src/app/models/persona';
import { Usuario } from 'src/app/models/usuario';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-registrarse',
  templateUrl: './registrarse.component.html',
  styleUrls: ['./registrarse.component.css']
})
export class RegistrarseComponent implements OnInit {
  public form!: FormGroup;

  constructor(private formBuilder: FormBuilder, private service: ApiService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      nombres: ['', [Validators.required]],
      apellidos: ['', Validators.required],
      correo: ['', Validators.required],
      celular: ['', Validators.required],
      username: ['', [Validators.required]],
      pass: ['', Validators.required]
    });
  }

  send(): any {
    let persona = new Persona();
    persona.nombre = this.form.value.nombres;
    persona.apellidos = this.form.value.apellidos;
    persona.correo = this.form.value.correo;
    persona.celular = this.form.value.celular;
    this.service.CrearPersona(persona).subscribe(data => {
      console.log(data)
      let usuario = new Usuario();
      usuario.persona = data;
      usuario.contrasena = this.form.value.pass;
      usuario.usuario = this.form.value.username;
      this.service.CrearUsuario(usuario).subscribe(user =>{
        console.log(user);
      });
    });
  }

}
