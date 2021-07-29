import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearCarreraComponent } from './pages/crear-carrera/crear-carrera.component';
import { CrearUniversidadComponent } from './pages/crear-universidad/crear-universidad.component';

const routes: Routes = [
  {path: "crearuniversidad", component: CrearUniversidadComponent},
  {path: "crearcarrera", component: CrearCarreraComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
