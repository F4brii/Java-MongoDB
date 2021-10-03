import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { PruebaComponent } from './components/prueba/prueba.component'

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'prueba', component: PruebaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
