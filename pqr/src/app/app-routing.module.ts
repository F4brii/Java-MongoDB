import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { RegistrarseComponent } from './components/registrarse/registrarse.component';
import { PqrsComponent } from './components/PQR/pqrs/pqrs.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'registrarse', component: RegistrarseComponent },
  { path: 'pqrs', component: PqrsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
