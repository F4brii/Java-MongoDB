import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { RegistrarseComponent } from './components/registrarse/registrarse.component';
import { PqrsComponent } from './components/PQR/pqrs/pqrs.component';
import { CrearComponent } from './components/PQR/crear/crear.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'registrarse', component: RegistrarseComponent },
  { path: 'pqrs', component: PqrsComponent },
  { path: 'pqrs/nuevo', component: CrearComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
