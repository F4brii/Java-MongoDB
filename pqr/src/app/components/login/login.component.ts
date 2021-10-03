import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Login } from 'src/app/models/login';
import { Usuario } from 'src/app/models/usuario';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public form!: FormGroup;
  private usuario!: Usuario;

  constructor(private formBuilder: FormBuilder, private service: ApiService) {
  }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      username: ['', [Validators.required]],
      pass: ['', Validators.required]
    });
  }

  send(): any {
    var login = new Login()
    login.usuario = this.form.value.username;
    login.pass = this.form.value.pass;
    this.service.Login(login).subscribe(data => {
      if (data != undefined || data != null) {
        this.usuario = data;
        localStorage.setItem('user', this.usuario.id);
        location.href="/prueba"
      }else{
        location.href="/";
      }
    });
  }

}
