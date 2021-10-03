import { Persona } from "./persona";
import { Tipo } from "./tipo";

export class Solicitud {
    id!: string;
    radicadoReclamo!: string;
    cuerpoSolicitud!: string;
    fechaSolicitud!: Date;
    estado!: boolean;
    tipo!: Tipo;
    persona!: Persona;
}