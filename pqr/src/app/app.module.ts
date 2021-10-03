import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './components/login/login.component';
import { PruebaComponent } from './components/prueba/prueba.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegistrarseComponent } from './components/registrarse/registrarse.component';
import { PqrsComponent } from './components/PQR/pqrs/pqrs.component';
import { TablaComponent } from './components/PQR/tabla/tabla.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    PruebaComponent,
    RegistrarseComponent,
    PqrsComponent,
    TablaComponent    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
